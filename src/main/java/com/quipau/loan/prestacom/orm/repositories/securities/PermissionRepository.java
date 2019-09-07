package com.quipau.loan.prestacom.orm.repositories.securities;

import com.quipau.loan.prestacom.orm.domains.securities.Permission;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PermissionRepository extends JpaRepository<Permission, Long> {

    Optional<Permission> findByCode(Integer code);

    Page<Permission> findAllByNameLikeAndEnabled(Pageable pageable, String filter, boolean enabled);

    long countByNameLikeAndEnabled(String filter, boolean enabled);

    //    @Query(value = "SELECT p.*" +
//            " FROM users u" +
//            "   JOIN user_permissions up ON u.id = up.user_id" +
//            "   JOIN permissions p ON up.permission_id = p.id" +
//            " WHERE u.id=?1 and p.name like '%%'", nativeQuery = true)
//    @EntityGraph(attributePaths = "permissions")
//    @Query("select article from Article article left join fetch article.topics where article.id =:id")
//    List<Permission> findAllPermissions(@Param("userId") Long userId, @Param("filterValue") String filterValue);
}
