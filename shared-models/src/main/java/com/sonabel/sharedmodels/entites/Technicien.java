package com.sonabel.sharedmodels.entites;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "technicien")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Technicien {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nom;

    private String email;
}
