package com.quipau.loan.prestacom.orm.services.people;

import com.quipau.loan.prestacom.models.interfaces.Services;
import com.quipau.loan.prestacom.orm.domains.people.Person;
import com.quipau.loan.prestacom.orm.repositories.people.PersonRepository;
import com.quipau.loan.prestacom.utils.Constants;
import org.springframework.stereotype.Service;

@Service
public class PersonService implements Services<Person> {

    private final PersonRepository repository;

    public PersonService(PersonRepository repository) {
        this.repository = repository;
    }

    public Person save(Person item) {
        return save(item, Constants.SYSTEM_USER, repository);
    }

}