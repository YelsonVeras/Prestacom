package com.quipau.loan.prestacom.utils.bootstrap;

import com.quipau.loan.prestacom.models.enums.EnumPermission;
import com.quipau.loan.prestacom.models.interfaces.BootStrapInsert;
import com.quipau.loan.prestacom.orm.domains.securities.PermissionGroup;
import com.quipau.loan.prestacom.services.securities.PermissionGroupService;
import com.quipau.loan.prestacom.services.securities.PermissionService;
import com.quipau.loan.prestacom.utils.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Component
public class BasicPermissionGroup implements BootStrapInsert {

    private final PermissionGroupService service;
    private final PermissionService permissionService;

    public PermissionGroup ROOT;
    public PermissionGroup ADMIN;

    @Autowired
    public BasicPermissionGroup(PermissionGroupService service, PermissionService permissionService) {
        this.service = service;
        this.permissionService = permissionService;
    }

    @Override
    public void insert() {
        ROOT = create(Constants.PERMISSION_GROUP_ROOT, rootPermissions());
        ADMIN = create(Constants.PERMISSION_GROUP_ADMIN, adminPermissions());
    }

    private PermissionGroup create(String name, List<EnumPermission> permissions) {
        Optional<PermissionGroup> optional = service.findByName(name);
        if (optional.isEmpty()) {
            PermissionGroup permissionGroup = new PermissionGroup();
            permissionGroup.setName(name);
            permissions.forEach(permission -> permissionService.findByCode(permission.code).ifPresent(permissionGroup::addPermission));
            return service.save(permissionGroup);
        }
        return optional.get();
    }

    private List<EnumPermission> rootPermissions() {
        return Collections.singletonList(EnumPermission.ROOT);
    }

    private List<EnumPermission> adminPermissions() {
        return Arrays.asList(
                EnumPermission.SECURITY_MENU,
                EnumPermission.COMPANY_MENU,
                EnumPermission.PARAM,
                EnumPermission.EDIT_PARAM,
                EnumPermission.VIEW_PARAM,
                EnumPermission.PERMISSION,
                EnumPermission.VIEW_PERMISSION,
                EnumPermission.P_GROUP,
                EnumPermission.NEW_P_GROUP,
                EnumPermission.EDIT_P_GROUP,
                EnumPermission.VIEW_P_GROUP,
                EnumPermission.DELETE_P_GROUP,
                EnumPermission.S_DEL_P_GROUP,
                EnumPermission.RESTORE_P_GROUP,
                EnumPermission.USER,
                EnumPermission.NEW_USER,
                EnumPermission.EDIT_USER,
                EnumPermission.VIEW_USER,
                EnumPermission.DELETE_USER,
                EnumPermission.S_DEL_USER,
                EnumPermission.RESTORE_USER,
                EnumPermission.COMPANY,
                EnumPermission.NEW_COMPANY,
                EnumPermission.EDIT_COMPANY,
                EnumPermission.VIEW_COMPANY,
                EnumPermission.DELETE_COMPANY,
                EnumPermission.S_DEL_COMPANY,
                EnumPermission.RESTORE_COMPANY,
                EnumPermission.BRANCH,
                EnumPermission.NEW_BRANCH,
                EnumPermission.EDIT_BRANCH,
                EnumPermission.VIEW_BRANCH,
                EnumPermission.DELETE_BRANCH,
                EnumPermission.S_DEL_BRANCH,
                EnumPermission.RESTORE_BRANCH,
                EnumPermission.DEPARTMENT,
                EnumPermission.NEW_DEPARTMENT,
                EnumPermission.EDIT_DEPARTMENT,
                EnumPermission.VIEW_DEPARTMENT,
                EnumPermission.DELETE_DEPARTMENT,
                EnumPermission.S_DEL_DEPARTMENT,
                EnumPermission.RESTORE_DEPARTMENT,
                EnumPermission.POSITION,
                EnumPermission.NEW_POSITION,
                EnumPermission.EDIT_POSITION,
                EnumPermission.VIEW_POSITION,
                EnumPermission.DELETE_POSITION,
                EnumPermission.S_DEL_POSITION,
                EnumPermission.RESTORE_POSITION,
                EnumPermission.EMPLOYEE,
                EnumPermission.NEW_EMPLOYEE,
                EnumPermission.EDIT_EMPLOYEE,
                EnumPermission.VIEW_EMPLOYEE,
                EnumPermission.DELETE_EMPLOYEE,
                EnumPermission.S_DEL_EMPLOYEE,
                EnumPermission.RESTORE_EMPLOYEE);
    }
}
