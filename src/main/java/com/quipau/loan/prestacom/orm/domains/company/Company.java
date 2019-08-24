package com.quipau.loan.prestacom.orm.domains.company;

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
@Entity(name = "companies")
public class Company extends Auditable {
    @Column(nullable = false)
    private String name;
    @Column(nullable = false, unique = true)
    private String url;
    private String activity;
    private String imgAddress;
    @Column(nullable = false, unique = true)
    private String rnc;
    private String description;
    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.MERGE)
    @JoinTable(name = "company_parameters", joinColumns = {@JoinColumn(name = "company_id")}, inverseJoinColumns = @JoinColumn(name = "parameter_id"))
    private Set<Parameter> parameters;
}
