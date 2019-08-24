package com.quipau.loan.prestacom.orm.repositories.securities;

import com.quipau.loan.prestacom.orm.domains.securities.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUserNameOrEmailAndPasswordAndEnabled(String userName, String email, String password, boolean enabled);

    Optional<User> findByUserNameAndPasswordAndEnabled(String userName, String password, boolean enabled);

    Optional<User> findByEmailAndPasswordAndEnabled(String email, String password, boolean enabled);

    Page<User> findAllByUserNameLikeAndEnabled(Pageable pageable, String filterValue, boolean enabled);

    long countByUserNameLikeAndEnabled(String filterValue, boolean enabled);
}
