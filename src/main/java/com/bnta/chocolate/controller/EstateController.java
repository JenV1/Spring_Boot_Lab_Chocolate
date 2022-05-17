package com.bnta.chocolate.controller;

import com.bnta.chocolate.models.Estate;
import com.bnta.chocolate.service.EstateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class EstateController {

    @Autowired
    private EstateService estateService;

    @GetMapping("/estates")
    public List<Estate> getAll() {
        return estateService.getAll();
    }

    @GetMapping("/estate/{id}")
    public Optional<Estate> getIndividualEstate(@PathVariable int id) {
        return estateService.getIndividualEstate(id);
    }
}
