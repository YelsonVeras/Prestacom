package com.quipau.loan.prestacom.orm.repositories.securities;

import com.quipau.loan.prestacom.orm.domains.securities.PermissionGroup;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PermissionGroupRepository extends JpaRepository<PermissionGroup, Long> {

    Optional<PermissionGroup> findByName(String name);

    //    @Query(value = "SELECT p.*" +
//            " FROM users u" +
//            "   JOIN user_permissions up ON u.id = up.user_id" +
//            "   JOIN permissions p ON up.permission_id = p.id" +
//            " WHERE u.id=?1 and p.name like '%%'", nativeQuery = true)
//    @EntityGraph(attributePaths = "permissions")
//    @Query("select pg from PermissionGroup pg left join fetch pg.permissions where pg.id =:id")
    Optional<PermissionGroup> findById(Long aLong);

    Page<PermissionGroup> findAllByNameLikeAndEnabled(Pageable pageable, String filter, boolean enabled);

    long countByNameLikeAndEnabled(String filter, boolean enabled);
}
