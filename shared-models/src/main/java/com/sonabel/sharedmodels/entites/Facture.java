package com.sonabel.sharedmodels.entites;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "facture")
@Data
public class Facture {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(name = "numero_facture", nullable = false, unique = true)
    private String numeroFacture;

    @Column(name = "montant_total", nullable = false)
    private BigDecimal montantTotal;

    @Column(name = "date_emission", nullable = false)
    private LocalDateTime dateEmission;

    @Column(name = "date_echeance")
    private LocalDateTime dateEcheance;

    @Column(name = "est_payee")
    private boolean estPayee;

    @Column(name = "mode_paiement")
    private String modePaiement;

}
