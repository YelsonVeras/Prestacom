package com.quipau.loan.prestacom.utils.bootstrap;

import com.quipau.loan.prestacom.models.enums.Language;
import com.quipau.loan.prestacom.models.interfaces.BootStrapInsert;
import com.quipau.loan.prestacom.orm.domains.securities.Permission;
import com.quipau.loan.prestacom.orm.domains.securities.User;
import com.quipau.loan.prestacom.services.securities.PermissionGroupService;
import com.quipau.loan.prestacom.services.securities.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;
import java.util.Set;

@Component
public class BasicUser implements BootStrapInsert {

    private final UserService service;
    private final PermissionGroupService permissionGroupService;
    private BasicPermissionGroup permissionGroup;

    @Autowired
    public BasicUser(PermissionGroupService permissionGroupService, UserService service) {
        this.permissionGroupService = permissionGroupService;
        this.service = service;
    }

    @Override
    public void insert() {
        create("root", "root@gmail.com", "root", Language.ENGLISH, true, permissionGroup.ROOT.getPermissions());
        create("admin", "admin@gmail.com", "admin", Language.SPANISH, false, permissionGroup.ADMIN.getPermissions());
    }

    void setPermissionGroup(BasicPermissionGroup permissionGroup) {
        this.permissionGroup = permissionGroup;
    }

    private void create(String userName, String email, String password, Language language, boolean isAdmin, Set<Permission> permissions) {
        Optional<User> optional = service.findByUserName(userName);
        if (optional.isEmpty()) {
            User user = new User();
            user.setUserName(userName);
            user.setEmail(email);
            user.setPassword(password);
            user.setLanguage(language);
            user.setIsAdmin(isAdmin);
            user.setPermissions(permissions);
            service.save(user);
        }
    }
//
//    private Set<Permission> rootPermissions() {
//        Set<Permission> permissions = new HashSet<>();
//        permissionGroupService.findByName(Constants.PERMISSION_GROUP_ADMIN).ifPresent(it -> permissions.addAll(it.getEagerPermissions()));
//        return permissions;
//    }
//
//    private Set<Permission> adminPermissions() {
//        Set<Permission> permissions = new HashSet<>();
//        permissionGroupService.findByName(Constants.PERMISSION_GROUP_ROOT).ifPresent(it -> permissions.addAll(it.getEagerPermissions()));
//        return permissions;
//    }
}
