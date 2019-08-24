package com.quipau.loan.prestacom.orm.repositories.location;

import com.quipau.loan.prestacom.orm.domains.locations.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends JpaRepository<Address, Long> {
}
