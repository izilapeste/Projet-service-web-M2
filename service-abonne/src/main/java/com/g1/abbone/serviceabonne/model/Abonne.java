package com.g1.abbone.serviceabonne.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

@Entity
public class Abonne {
    public enum Sexe { F, M }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private String prenom;
    @Enumerated(EnumType.STRING)
    private Sexe sexe;
    private String numTelephone;
    private String ville;
    private String secteur;
    private String mail;

    // Getters et setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getNom() { return nom; }
    public void setNom(String nom) { this.nom = nom; }
    public String getPrenom() { return prenom; }
    public void setPrenom(String prenom) { this.prenom = prenom; }
    public Sexe getSexe() { return sexe; }
    public void setSexe(Sexe sexe) { this.sexe = sexe; }
    public String getNumTelephone() { return numTelephone; }
    public void setNumTelephone(String numTelephone) { this.numTelephone = numTelephone; }
    public String getVille() { return ville; }
    public void setVille(String ville) { this.ville = ville; }
    public String getSecteur() { return secteur; }
    public void setSecteur(String secteur) { this.secteur = secteur; }
    public String getMail() { return mail; }
    public void setMail(String mail) { this.mail = mail; }
}