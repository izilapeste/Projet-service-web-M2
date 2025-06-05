package com.sonabel.sharedmodels.repositories;

import com.sonabel.sharedmodels.entites.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client , Long> {
}
