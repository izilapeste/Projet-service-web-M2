package com.example.intervention.serviceintervention.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.intervention.serviceintervention.model.Intervention;

public interface InterventionRepository extends JpaRepository<Intervention, Long> {}
