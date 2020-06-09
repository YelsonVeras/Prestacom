package com.quipau.loan.prestacom.orm.services.company;

import com.quipau.loan.prestacom.models.interfaces.Services;
import com.quipau.loan.prestacom.orm.domains.company.Department;
import com.quipau.loan.prestacom.orm.repositories.company.DepartmentRepository;
import com.quipau.loan.prestacom.utils.Constants;
import org.springframework.stereotype.Service;

@Service
public class DepartmentService implements Services<Department> {

    private final DepartmentRepository repository;

    public DepartmentService(DepartmentRepository repository) {
        this.repository = repository;
    }

    public Department save(Department item) {
        return save(item, Constants.SYSTEM_USER, repository);
    }

}