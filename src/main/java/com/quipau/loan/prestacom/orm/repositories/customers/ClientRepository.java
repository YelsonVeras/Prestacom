package com.quipau.loan.prestacom.orm.repositories.customers;

import com.quipau.loan.prestacom.orm.domains.customers.Client;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

    Page<Client> findAllByPerson_NamesLikeAndEnabled(Pageable pageable, String filterValue, boolean enabled);

    long countByPerson_NamesLikeAndEnabled(String filterValue, boolean enabled);
}
