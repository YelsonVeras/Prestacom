package com.quipau.loan.prestacom.services.securities;

import com.quipau.loan.prestacom.models.interfaces.Services;
import com.quipau.loan.prestacom.orm.domains.securities.PermissionGroup;
import com.quipau.loan.prestacom.orm.repositories.securities.PermissionGroupRepository;
import com.quipau.loan.prestacom.utils.Constants;
import org.springframework.stereotype.Service;

@Service
public class PermissionGroupService implements Services<PermissionGroup> {

    private final PermissionGroupRepository repository;

    public PermissionGroupService(PermissionGroupRepository repository) {
        this.repository = repository;
    }

    public PermissionGroup save(PermissionGroup item) {
        return save(item, Constants.SYSTEM_USER, repository);
    }

}