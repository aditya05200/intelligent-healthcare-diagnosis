package com.health.care.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.health.care.model.Symptoms;
import com.health.care.services.SymptomsService;

@RestController
@RequestMapping("/symptoms")
public class SymptomsController {

    @Autowired
    private SymptomsService symptomsService;

    @GetMapping
    public List<Symptoms> getAllSymptoms() {
        return symptomsService.getAllSymptoms();
    }

    @PostMapping
    public Symptoms createSymptoms(@RequestBody Symptoms symptoms) {
        return symptomsService.saveSymptoms(symptoms);
    }
}
