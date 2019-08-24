package com.quipau.loan.prestacom.services.securities;

import com.quipau.loan.prestacom.models.interfaces.Services;
import com.quipau.loan.prestacom.orm.domains.securities.Permission;
import com.quipau.loan.prestacom.orm.repositories.securities.PermissionRepository;
import com.quipau.loan.prestacom.utils.Constants;
import org.springframework.stereotype.Service;

@Service
public class PermissionService implements Services<Permission> {

    private final PermissionRepository repository;

    public PermissionService(PermissionRepository repository) {
        this.repository = repository;
    }

    public Permission save(Permission item) {
        return save(item, Constants.SYSTEM_USER, repository);
    }

}