package com.quipau.loan.prestacom.orm.services.securities;

import com.quipau.loan.prestacom.models.interfaces.Services;
import com.quipau.loan.prestacom.orm.domains.securities.Permission;
import com.quipau.loan.prestacom.orm.repositories.securities.PermissionRepository;
import com.quipau.loan.prestacom.utils.Constants;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PermissionService implements Services<Permission> {

    private final PermissionRepository repository;

    public PermissionService(PermissionRepository repository) {
        this.repository = repository;
    }

    public Permission save(Permission item) {
        return save(item, Constants.SYSTEM_USER, repository);
    }

    public Optional<Permission> findByCode(Integer code) {
        return repository.findByCode(code);
    }

    public Page<Permission> getAll(int page, int size, String filter, boolean enabled) {
        return repository.findAllByNameLikeAndEnabled(PageRequest.of(page / size, size), "%" + filter + "%", enabled);
    }
}