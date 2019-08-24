package com.quipau.loan.prestacom.orm.domains.company;

import com.quipau.loan.prestacom.models.abstracts.Auditable;
import lombok.*;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;


@Data
@Builder
@DynamicUpdate
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "departments")
public class Department extends Auditable {
    private String name;
}
