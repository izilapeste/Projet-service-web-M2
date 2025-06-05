package com.sonabel.sharedmodels.repositories;

import com.sonabel.sharedmodels.entites.Intervention;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InterventionRepository extends JpaRepository<Intervention , Long> {
}
