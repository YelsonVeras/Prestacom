package com.quipau.loan.prestacom.orm.services.securities;

import com.quipau.loan.prestacom.models.interfaces.Services;
import com.quipau.loan.prestacom.orm.domains.securities.Parameter;
import com.quipau.loan.prestacom.orm.repositories.securities.ParameterRepository;
import com.quipau.loan.prestacom.utils.Constants;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ParameterService implements Services<Parameter> {

    private final ParameterRepository repository;

    public ParameterService(ParameterRepository repository) {
        this.repository = repository;
    }

    public Parameter save(Parameter item) {
        return save(item, Constants.SYSTEM_USER, repository);
    }

    public Optional<Parameter> findByCode(Integer code) {
        return repository.findByCode(code);
    }
}