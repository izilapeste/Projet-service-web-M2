package com.g1.abbone.serviceabonne.controller;

import com.g1.abbone.serviceabonne.model.Abonne;
import com.g1.abbone.serviceabonne.repository.AbonneRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.data.domain.Sort;
import java.util.List;

@Controller
@RequestMapping("/abonnes")
public class AbonneFormController {
    private final AbonneRepository repository;

    public AbonneFormController(AbonneRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/new")
    public String showForm(Model model) {
        model.addAttribute("abonne", new Abonne());
        model.addAttribute("formTitle", "Enregistrer un abonné");
        return "abonne-form";
    }

    @PostMapping("/save")
    public String saveAbonne(@ModelAttribute Abonne abonne) {
        boolean isModification = abonne.getId() != null;
        repository.save(abonne);
        if (isModification) {
            return "redirect:/abonnes/list?modified";
        } else {
            return "redirect:/abonnes/list?success";
        }
    }
    @GetMapping("/list")
    public String listAbonnes(Model model) {
        List<Abonne> abonnes = repository.findAll(Sort.by("id"));
        model.addAttribute("abonnes", abonnes);
        return "abonne-list";
    }
    @GetMapping("/edit/{id}")
    public String editAbonne(@PathVariable Long id, Model model) {
        Abonne abonne = repository.findById(id).orElseThrow();
        model.addAttribute("abonne", abonne);
        model.addAttribute("formTitle", "Modifier un abonné");
        return "abonne-form";
    }
    @PostMapping("/delete/{id}")
    public String deleteAbonne(@PathVariable Long id) {
        repository.deleteById(id);
        return "redirect:/abonnes/list";
    }
}