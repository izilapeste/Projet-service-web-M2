package com.example.intervention.serviceintervention.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.intervention.serviceintervention.model.Intervention;
import com.example.intervention.serviceintervention.repository.InterventionRepository;

@Service
public class InterventionService {

    private final InterventionRepository interventionRepository;

    @Autowired
    public InterventionService(InterventionRepository interventionRepository) {
        this.interventionRepository = interventionRepository;
    }

    public List<Intervention> getAllInterventions() {
        return interventionRepository.findAll();
    }

    public Optional<Intervention> getInterventionById(Long id) {
        return interventionRepository.findById(id);
    }

    public Intervention createIntervention(Intervention intervention) {
        return interventionRepository.save(intervention);
    }

    public Intervention updateIntervention(Long id, Intervention updated) {
        return interventionRepository.findById(id)
            .map(existing -> {
                existing.setDatePlanifiee(updated.getDatePlanifiee());
                existing.setDescription(updated.getDescription());
                existing.setStatut(updated.getStatut());
                existing.setTechnicien(updated.getTechnicien());
                existing.setResponsable(updated.getResponsable());
                return interventionRepository.save(existing);
            })
            .orElseThrow(() -> new RuntimeException("Intervention non trouvée"));
    }

    public void deleteIntervention(Long id) {
        interventionRepository.deleteById(id);
    }

    public Intervention planifierIntervention(Intervention intervention) {
        intervention.setStatut("PLANIFIEE");
        return interventionRepository.save(intervention);
    }

    public List<Intervention> listerInterventionsTechnicien(Long idTech) {
        return interventionRepository.findAll().stream()
            .filter(i -> i.getTechnicien().getId().equals(idTech))
            .collect(Collectors.toList());
    }

    public Intervention demanderIntervention(Intervention intervention) {
        // Logique métier pour enregistrer ou traiter la demande
        System.err.println("Service demander");
        return interventionRepository.save(intervention);
    }

    public Intervention executerIntervention(Intervention intervention) {
        intervention.setStatut("EXECUTEE");
        return interventionRepository.save(intervention);    }

}
