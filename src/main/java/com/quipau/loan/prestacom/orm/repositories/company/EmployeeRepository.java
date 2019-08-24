package com.quipau.loan.prestacom.orm.repositories.company;

import com.quipau.loan.prestacom.orm.domains.company.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    Page<Employee> findAllByPerson_NamesLikeAndEnabled(Pageable pageable, String filterValue, boolean enabled);

    long countByPerson_NamesLikeAndEnabled(String filterValue, boolean enabled);
}
