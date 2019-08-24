package com.quipau.loan.prestacom.orm.repositories.location;

import com.quipau.loan.prestacom.orm.domains.locations.Country;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CountryRepository extends JpaRepository<Country, Long> {
    Optional<Country> findByNameAndEnabled(String name, boolean enabled);

    Page<Country> findAllByNameLikeAndEnabled(Pageable pageable, String filterValue, boolean enabled);

    long countByNameLikeAndEnabled(String filterValue, boolean enabled);
}
