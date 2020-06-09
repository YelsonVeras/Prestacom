package com.quipau.loan.prestacom.orm.services.company;

import com.quipau.loan.prestacom.models.interfaces.Services;
import com.quipau.loan.prestacom.orm.domains.company.Employee;
import com.quipau.loan.prestacom.orm.repositories.company.EmployeeRepository;
import com.quipau.loan.prestacom.utils.Constants;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService implements Services<Employee> {

    private final EmployeeRepository repository;

    public EmployeeService(EmployeeRepository repository) {
        this.repository = repository;
    }

    public Employee save(Employee item) {
        return save(item, Constants.SYSTEM_USER, repository);
    }

}