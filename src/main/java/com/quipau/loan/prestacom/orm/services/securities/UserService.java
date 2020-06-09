package com.quipau.loan.prestacom.orm.services.securities;

import com.quipau.loan.prestacom.models.interfaces.Services;
import com.quipau.loan.prestacom.orm.domains.securities.User;
import com.quipau.loan.prestacom.orm.repositories.securities.UserRepository;
import com.quipau.loan.prestacom.utils.Constants;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService implements Services<User> {

    private final UserRepository repository;

    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    public User save(User item) {
        return save(item, Constants.SYSTEM_USER, repository);
    }

    public Optional<User> findByUserName(String userName) {
        return repository.findByUserName(userName);
    }
}