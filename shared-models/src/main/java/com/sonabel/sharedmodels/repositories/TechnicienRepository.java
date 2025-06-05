package com.sonabel.sharedmodels.repositories;

import com.sonabel.sharedmodels.entites.Technicien;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TechnicienRepository extends JpaRepository<Technicien, Long> {
}
