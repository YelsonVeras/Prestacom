package com.quipau.loan.prestacom.orm.services.customers;

import com.quipau.loan.prestacom.models.interfaces.Services;
import com.quipau.loan.prestacom.orm.domains.customers.Client;
import com.quipau.loan.prestacom.orm.repositories.customers.ClientRepository;
import com.quipau.loan.prestacom.utils.Constants;
import org.springframework.stereotype.Service;

@Service
public class ClientService implements Services<Client> {

    private final ClientRepository repository;

    public ClientService(ClientRepository repository) {
        this.repository = repository;
    }

    public Client save(Client item) {
        return save(item, Constants.SYSTEM_USER, repository);
    }

    public void softDelete(Long id) {
        repository.findById(id).ifPresent(item -> {
            item.setEnabled(item.isEnabled());
            save(item);
        });
    }
}