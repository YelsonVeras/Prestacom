package com.quipau.loan.prestacom.orm.domains.locations;

import com.quipau.loan.prestacom.models.abstracts.Auditable;
import lombok.*;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;

@Data
@Builder
@DynamicUpdate
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "addresses")
public class Address extends Auditable {
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "country_id")
    private Country country;
    @Column(nullable = false)
    private String city;
    private String sector;
    private String zipCode;
    @Column(nullable = false)
    private String address;
}
