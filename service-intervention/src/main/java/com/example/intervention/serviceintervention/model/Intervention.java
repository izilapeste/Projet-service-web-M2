package com.example.intervention.serviceintervention.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;


@Entity
public class Intervention {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String description;
    private String commentaire;

    private String datePlanifiee;
    private String dateExecution;
    private String dateDemanDateTime;

    private String statut; // PLANIFIEE, EN_COURS, TERMINEE

    @ManyToOne
    private Technicien technicien;

    @ManyToOne
    private Responsable responsable;

    @ManyToOne
    private Client client;

    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public String getDescription() {
        return description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    
    public String getDatePlanifiee() {
        return datePlanifiee;
    }
    
    public void setDatePlanifiee(String datePlanifiee) {
        this.datePlanifiee = datePlanifiee;
    }
    
    public String getStatut() {
        return statut;
    }
    
    public void setStatut(String statut) {
        this.statut = statut;
    }
    
    public Technicien getTechnicien() {
        return technicien;
    }
    
    public void setTechnicien(Technicien technicien) {
        this.technicien = technicien;
    }
    
    public Responsable getResponsable() {
        return responsable;
    }
    
    public void setResponsable(Responsable responsable) {
        this.responsable = responsable;
    }
    
    public Client getClient() {
        return client;
    }
    
    public void setClient(Client client) {
        this.client = client;
    }

    public String getDateExecution() {
        return dateExecution;
    }

    public String getDateDemanDateTime() {
        return dateDemanDateTime;
    }

    public String getCommentaire() {
        return commentaire;
    }

    public void setCommentaire(String commentaire) {
        this.commentaire = commentaire;
    }
}

