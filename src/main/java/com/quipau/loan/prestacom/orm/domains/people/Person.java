package com.quipau.loan.prestacom.orm.domains.people;

import com.quipau.loan.prestacom.models.abstracts.Auditable;
import com.quipau.loan.prestacom.models.enums.person.Gender;
import com.quipau.loan.prestacom.models.enums.person.MaritalStatus;
import com.quipau.loan.prestacom.models.enums.person.Nationality;
import com.quipau.loan.prestacom.orm.domains.locations.Address;
import lombok.*;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.util.Date;

@Data
@Builder
@DynamicUpdate
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "people")
public class Person extends Auditable {
    @Column(nullable = false)
    private String names;
    private String lastNames;
    private Date birth;
    private Gender gender;
    @Column(nullable = false, unique = true)
    private String dni;
    private Nationality nationality;
    private MaritalStatus maritalStatus;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "address_id")
    private Address address;
}

