package com.quipau.loan.prestacom.models.interfaces;

import com.quipau.loan.prestacom.models.abstracts.Auditable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.Optional;

public interface Services<T extends Auditable> {

    default T save(T item, String userName, JpaRepository<T, Long> repository) {
        if (item != null) {
            return repository.save(audit(item, repository, userName));
        }
        return null;
    }

    default T audit(T item, JpaRepository<T, Long> repository, String userName) {
        if (existsById(item.getId(), repository)) {
            item.setLastModifiedDate(new Date());
            item.setLastModifiedBy(userName);
        } else {
            item.setCreatedBy(userName);
            item.setCreatedDate(new Date());
        }
        return item;
    }

    default boolean existsById(long id, JpaRepository<T, Long> repository) {
        return repository.existsById(id);
    }

    default Optional<T> refresh(long id, JpaRepository<T, Long> repository) {
        return repository.findById(id);
    }

    default void softDelete(long id, JpaRepository<T, Long> repository, String userName) {
        refresh(id, repository).ifPresent(item -> {
            item.setEnabled(item.isEnabled());
            save(item, userName, repository);
        });
    }
}
