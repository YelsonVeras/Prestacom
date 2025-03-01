package com.quipau.loan.prestacom.orm.services.locations;

import com.quipau.loan.prestacom.models.interfaces.Services;
import com.quipau.loan.prestacom.orm.domains.locations.Country;
import com.quipau.loan.prestacom.orm.repositories.location.CountryRepository;
import com.quipau.loan.prestacom.utils.Constants;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CountryService implements Services<Country> {

    private final CountryRepository repository;

    public CountryService(CountryRepository repository) {
        this.repository = repository;
    }

    public Country save(Country item) {
        return save(item, Constants.SYSTEM_USER, repository);
    }

    public Optional<Country> findByName(String name) {
        return repository.findByName(name);
    }
}