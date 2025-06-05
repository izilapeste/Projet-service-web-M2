package com.sonabel.sharedmodels.entites;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "intervention")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Intervention {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String description;

    private String commentaire;

    @Column(name = "date_planifiee")
    private String datePlanifiee;

    @Column(name = "date_execution")
    private String dateExecution;

    @Column(name = "date_deman_date_time")
    private String dateDemanDateTime;

    private String statut;
}
