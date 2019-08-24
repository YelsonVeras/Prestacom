package com.quipau.loan.prestacom.orm.repositories.company;

import com.quipau.loan.prestacom.orm.domains.company.Company;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompanyRepository extends JpaRepository<Company, Long> {

    Page<Company> findAllByNameLikeAndEnabled(Pageable pageable, String filterValue, boolean enabled);

    long countByNameLikeAndEnabled(String filterValue, boolean enabled);
}
