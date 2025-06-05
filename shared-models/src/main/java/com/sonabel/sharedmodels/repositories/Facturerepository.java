package com.sonabel.sharedmodels.repositories;
import com.sonabel.sharedmodels.entites.Facture;
import org.springframework.data.jpa.repository.JpaRepository;


public interface Facturerepository extends JpaRepository<Facture,Long> {
}
