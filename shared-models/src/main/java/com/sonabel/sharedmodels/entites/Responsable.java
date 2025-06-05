package com.sonabel.sharedmodels.entites;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "responsable")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Responsable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nom;

    private String email;
}
