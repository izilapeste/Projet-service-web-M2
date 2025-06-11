package com.sonabel.sharedmodels.repositories;

import com.sonabel.sharedmodels.entites.Client;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ClientRepository extends JpaRepository<Client , Long> {

    Optional<Client> findByUsername(String username);

}
