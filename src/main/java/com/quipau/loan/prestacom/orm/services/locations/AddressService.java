package com.quipau.loan.prestacom.orm.services.locations;

import com.quipau.loan.prestacom.models.interfaces.Services;
import com.quipau.loan.prestacom.orm.domains.locations.Address;
import com.quipau.loan.prestacom.orm.repositories.location.AddressRepository;
import com.quipau.loan.prestacom.utils.Constants;
import org.springframework.stereotype.Service;

@Service
public class AddressService implements Services<Address> {

    private final AddressRepository repository;

    public AddressService(AddressRepository repository) {
        this.repository = repository;
    }

    public Address save(Address item) {
        return save(item, Constants.SYSTEM_USER, repository);
    }

    public void softDelete(Long id) {
        repository.findById(id).ifPresent(item -> {
            item.setEnabled(item.isEnabled());
            save(item);
        });
    }
}