package com.quipau.loan.prestacom.orm.repositories.people;

import com.quipau.loan.prestacom.orm.domains.people.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {
}
