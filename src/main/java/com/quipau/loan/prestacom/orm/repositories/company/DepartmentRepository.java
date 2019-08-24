package com.quipau.loan.prestacom.orm.repositories.company;

import com.quipau.loan.prestacom.orm.domains.company.Department;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {

    Page<Department> findAllByNameLikeAndEnabled(Pageable pageable, String filterValue, boolean enabled);

    long countByNameLikeAndEnabled(String filterValue, boolean enabled);
}
