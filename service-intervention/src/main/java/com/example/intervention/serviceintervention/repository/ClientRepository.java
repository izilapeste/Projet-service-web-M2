package com.example.intervention.serviceintervention.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.intervention.serviceintervention.model.Client;

public interface ClientRepository extends JpaRepository<Client, Long> {}
