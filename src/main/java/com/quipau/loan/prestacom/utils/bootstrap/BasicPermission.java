package com.quipau.loan.prestacom.utils.bootstrap;

import com.quipau.loan.prestacom.models.enums.EnumPermission;
import com.quipau.loan.prestacom.models.interfaces.BootStrapInsert;
import com.quipau.loan.prestacom.orm.domains.securities.Permission;
import com.quipau.loan.prestacom.orm.services.securities.PermissionService;
import com.quipau.loan.prestacom.utils.security.SystemPermission;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class BasicPermission implements BootStrapInsert {

    private final PermissionService service;

    @Autowired
    public BasicPermission(PermissionService service) {
        this.service = service;
    }

    @Override
    public void insert() {
        for (EnumPermission enumPermission : EnumPermission.values()) {
            Optional<Permission> optional = service.findByCode(enumPermission.code);
            if (optional.isEmpty()) {
                Permission permission = new Permission();
                permission.setCode(enumPermission.code);
                permission.setName(SystemPermission.name(enumPermission));
                permission.setDescription(SystemPermission.description(enumPermission));
                service.save(permission);
            }
        }
    }
}
