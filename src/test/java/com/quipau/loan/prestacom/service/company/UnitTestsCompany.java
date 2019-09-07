package com.quipau.loan.prestacom.service.company;

import com.quipau.loan.prestacom.orm.domains.company.Company;
import com.quipau.loan.prestacom.services.company.CompanyService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashSet;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UnitTestsCompany {

    private final CompanyService service;
    private Company company = new Company();

    public UnitTestsCompany(CompanyService service) {
        this.service = service;
        buildCompany();
    }

    @Test
    public void create() {
        company = service.save(company);
    }

    private void buildCompany() {
        company.setName("Yatta International");
        company.setUrl("yatta");
        company.setActivity("Empresa dedicada al desarrollo de software para navieras");
        company.setDescription("Empresa dedicada al desarrollo de software para navieras");
        company.setImgAddress("c:/");
        company.setRnc("031-0554508-5");
        company.setParameters(new HashSet<>());
    }

    @Test
    public void read() {
        System.out.println(company.toString());
        System.out.println(service.findAllByNameLikeAndEnabled(PageRequest.of(0, 25), "", true));
        System.out.println(service.countByNameLikeAndEnabled("", true));
    }

    @Test
    public void update() {
        company.setName("Miroku International");
        service.save(company);
    }

    @Test
    public void delete() {
        service.softDelete(company.getId(), "");
    }
}
