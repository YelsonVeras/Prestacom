package com.quipau.loan.prestacom.services.company;

import com.quipau.loan.prestacom.models.interfaces.Services;
import com.quipau.loan.prestacom.orm.domains.company.Branch;
import com.quipau.loan.prestacom.orm.repositories.company.BranchRepository;
import com.quipau.loan.prestacom.utils.Constants;
import org.springframework.stereotype.Service;

@Service
public class BranchService implements Services<Branch> {

    private final BranchRepository repository;

    public BranchService(BranchRepository repository) {
        this.repository = repository;
    }

    public Branch save(Branch item) {
        return save(item, Constants.SYSTEM_USER, repository);
    }

}