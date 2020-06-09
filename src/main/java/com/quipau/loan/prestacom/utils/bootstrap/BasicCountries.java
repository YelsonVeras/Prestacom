package com.quipau.loan.prestacom.utils.bootstrap;

import com.quipau.loan.prestacom.models.enums.location.*;
import com.quipau.loan.prestacom.models.interfaces.BootStrapInsert;
import com.quipau.loan.prestacom.orm.domains.locations.Country;
import com.quipau.loan.prestacom.orm.services.locations.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
class BasicCountries implements BootStrapInsert {

    private final CountryService service;

    @Autowired
    public BasicCountries(CountryService service) {
        this.service = service;
    }

    @Override
    public void insert() {
        createAmericanCountries();
        createEuropeanCountries();
        createOceanicCountries();
        createAfricanCountries();
        createAsianCountries();
    }

    private void createAmericanCountries() {
        Arrays.stream(AmericanCountries.values()).forEach(countries -> service.findByName(AmericanCountries.getCaption(countries)).orElseGet(() -> service.save(new Country(AmericanCountries.getCaption(countries)))));
    }

    private void createEuropeanCountries() {
        Arrays.stream(EuropeanCountries.values()).forEach(countries -> service.findByName(EuropeanCountries.getCaption(countries)).orElseGet(() -> service.save(new Country(EuropeanCountries.getCaption(countries)))));
    }

    private void createOceanicCountries() {
        Arrays.stream(OceanicCountries.values()).forEach(countries -> service.findByName(OceanicCountries.getCaption(countries)).orElseGet(() -> service.save(new Country(OceanicCountries.getCaption(countries)))));
    }

    private void createAfricanCountries() {
        Arrays.stream(AfricanCountries.values()).forEach(countries -> service.findByName(AfricanCountries.getCaption(countries)).orElseGet(() -> service.save(new Country(AfricanCountries.getCaption(countries)))));
    }

    private void createAsianCountries() {
        Arrays.stream(AsianCountries.values()).forEachOrdered(countries -> service.findByName(AsianCountries.getCaption(countries)).orElseGet(() -> service.save(new Country(AsianCountries.getCaption(countries)))));
    }
}