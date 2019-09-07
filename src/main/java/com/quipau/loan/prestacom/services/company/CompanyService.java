package com.quipau.loan.prestacom.services.company;

import com.quipau.loan.prestacom.models.interfaces.Services;
import com.quipau.loan.prestacom.orm.domains.company.Company;
import com.quipau.loan.prestacom.orm.repositories.company.CompanyRepository;
import com.quipau.loan.prestacom.utils.Constants;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class CompanyService implements Services<Company> {

    private final CompanyRepository repository;

    public CompanyService(CompanyRepository repository) {
        this.repository = repository;
    }

//    public Company save(Company item) {
//        return save(item, Constants.SYSTEM_USER, repository);
//    }

    public Page<Company> findAllByNameLikeAndEnabled(Pageable pageable, String filterValue, boolean enabled) {
        return repository.findAllByNameLikeAndEnabled(pageable, filterValue, enabled);
    }

    public long countByNameLikeAndEnabled(String filterValue, boolean enabled) {
        return repository.countByNameLikeAndEnabled(filterValue, enabled);
    }

//    public void softDelete(long id, String userName) {
//        softDelete(id, repository, userName);
//    }
}