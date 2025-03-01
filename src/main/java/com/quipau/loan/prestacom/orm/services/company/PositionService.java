package com.quipau.loan.prestacom.orm.services.company;

import com.quipau.loan.prestacom.models.interfaces.Services;
import com.quipau.loan.prestacom.orm.domains.company.Position;
import com.quipau.loan.prestacom.orm.repositories.company.PositionRepository;
import com.quipau.loan.prestacom.utils.Constants;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class PositionService implements Services<Position> {

    private final PositionRepository repository;

    public PositionService(PositionRepository repository) {
        this.repository = repository;
    }

    public Position save(Position item) {
        return save(item, Constants.SYSTEM_USER, repository);
    }

    public Page<Position> findAll(Pageable pageable, String filterValue) {
        return repository.findAllByNameLikeAndEnabled(pageable, "%" + filterValue + "%", true);
    }
}