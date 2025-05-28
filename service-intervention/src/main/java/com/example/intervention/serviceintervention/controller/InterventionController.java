package com.example.intervention.serviceintervention.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.intervention.serviceintervention.model.Intervention;
import com.example.intervention.serviceintervention.service.InterventionService;

@RestController
@RequestMapping("/api/interventions")
public class InterventionController {

    @Autowired
    private InterventionService interventionService;

    @PostMapping("/planifier")
    public ResponseEntity<Intervention> planifier(@RequestBody Intervention intervention) {
        Intervention saved = interventionService.planifierIntervention(intervention);
        return new ResponseEntity<>(saved, HttpStatus.CREATED);
    }
    @PostMapping("/demande")
    public ResponseEntity<Intervention> demandeIntervention(@RequestBody Intervention intervention) {
        System.out.println("POST /demande called");
        Intervention saved = interventionService.demanderIntervention(intervention);
        return new ResponseEntity<>(saved, HttpStatus.CREATED);
    }
    @GetMapping
        public ResponseEntity<List<Intervention>> listerToutesLesInterventions() {
            List<Intervention> interventions = interventionService.getAllInterventions();
            return new ResponseEntity<>(interventions, HttpStatus.OK);
        }
    
     
        

    @GetMapping("/technicien/{id}")
    public ResponseEntity<List<com.example.intervention.serviceintervention.model.Intervention>> getByTechnicien(@PathVariable Long id) {
        return ResponseEntity.ok(interventionService.listerInterventionsTechnicien(id));
    }
}
