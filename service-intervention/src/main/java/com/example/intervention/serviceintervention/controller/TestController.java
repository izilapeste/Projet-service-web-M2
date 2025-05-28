package com.example.intervention.serviceintervention.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/interventions")
public class TestController {

    @PostMapping("/demandes")
    public ResponseEntity<String> testDemande() {
        return ResponseEntity.ok("Demande reçue");
    }
}
