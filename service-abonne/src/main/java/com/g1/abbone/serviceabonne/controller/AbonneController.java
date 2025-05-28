package com.g1.abbone.serviceabonne.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AbonneController {
    @GetMapping("/")
    public String accueil() {
        return "Bienvenue sur le service abonné !";
    }
}