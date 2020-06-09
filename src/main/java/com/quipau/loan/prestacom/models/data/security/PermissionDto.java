package com.quipau.loan.prestacom.models.data.security;

import com.quipau.loan.prestacom.orm.domains.securities.Permission;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PermissionDto {
    private Long id;
    private Integer code;
    private String name;
    private String description;

    public static PermissionDto domainToDto(Permission permission) {
        PermissionDto result = new PermissionDto();

        result.setId(permission.getId());
        result.setCode(permission.getCode());
        result.setName(permission.getName());
        result.setDescription(permission.getDescription());

        return result;
    }
}
