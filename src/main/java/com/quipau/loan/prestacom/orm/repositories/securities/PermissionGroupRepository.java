package com.quipau.loan.prestacom.orm.repositories.securities;

import com.quipau.loan.prestacom.orm.domains.securities.PermissionGroup;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PermissionGroupRepository extends JpaRepository<PermissionGroup, Long> {
    Optional<PermissionGroup> findByNameAndEnabled(String name, boolean enabled);

    Page<PermissionGroup> findAllByNameLikeAndEnabled(Pageable pageable, String filter, boolean enabled);

    long countByNameLikeAndEnabled(String filter, boolean enabled);
}
