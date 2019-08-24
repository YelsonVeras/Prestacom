package com.quipau.loan.prestacom.orm.domains.securities;

import com.quipau.loan.prestacom.models.abstracts.Auditable;
import com.quipau.loan.prestacom.models.enums.Language;
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
@Entity(name = "users")
public class User extends Auditable {
    @Column(nullable = false, unique = true)
    private String userName;
    @Column(nullable = false, unique = true)
    private String email;
    @Column(nullable = false)
    private String password;
    @Column(nullable = false)
    private Language language;
    private Boolean isAdmin = false;
    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.MERGE)
    @JoinTable(name = "user_permissions", joinColumns = {@JoinColumn(name = "user_id")}, inverseJoinColumns = @JoinColumn(name = "permission_id"))
    private Set<Permission> permissions;
}


