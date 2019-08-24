package com.quipau.loan.prestacom.orm.domains.securities;

import com.quipau.loan.prestacom.models.abstracts.Auditable;
import lombok.*;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Column;
import javax.persistence.Entity;

@Data
@Builder
@DynamicUpdate
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "permissions")
@org.hibernate.annotations.Entity(dynamicUpdate = true)
public class Permission extends Auditable {
    @Column(nullable = false, unique = true)
    private int code;
    @Column(nullable = false, unique = true)
    private String name;
    private String description;
}