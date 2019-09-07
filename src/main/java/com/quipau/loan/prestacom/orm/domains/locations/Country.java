package com.quipau.loan.prestacom.orm.domains.locations;

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
@Entity(name = "countries")
public class Country extends Auditable {
    @Column(nullable = false, unique = true)
    private String name;
}
