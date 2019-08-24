package com.quipau.loan.prestacom.orm.domains.securities;

import com.quipau.loan.prestacom.models.abstracts.Auditable;
import lombok.*;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.util.Set;

@Data
@Builder
@DynamicUpdate
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "permission_groups")
public class PermissionGroup extends Auditable {
    @Column(nullable = false, unique = true)
    private String name;
    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(name = "permission_group_permissions",
            joinColumns = {@JoinColumn(name = "group_id")},
            inverseJoinColumns = @JoinColumn(name = "permission_id"))
    private Set<Permission> permissions;
}