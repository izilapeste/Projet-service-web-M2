package com.sonabel.sharedmodels.entites;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "client")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Client {

    public enum Sexe {
        F, M
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nom;

    private String prenom;

    @Enumerated(EnumType.STRING)
    private Sexe sexe;

    @Column(name = "num_telephone")
    private String numTelephone;

    private String ville;

    private String secteur;

    private String mail;

    private String username;

    private String password;
}
