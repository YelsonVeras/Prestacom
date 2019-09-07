package com.quipau.loan.prestacom.orm.domains.securities;

import com.quipau.loan.prestacom.models.abstracts.Auditable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Column;
import javax.persistence.Entity;

;

@Data
@DynamicUpdate
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "parameters")
public class Parameter extends Auditable {
    @Column(nullable = false, unique = true)
    private Integer code;
    @Column(nullable = false, unique = true)
    private String name;
    @Column(nullable = false)
    private String value = "";
    private String description;
    private Boolean changeRoot = false;
}
