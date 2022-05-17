package com.bnta.chocolate.controller;

import com.bnta.chocolate.models.Estate;
import com.bnta.chocolate.service.EstateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
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

    @PostMapping("/estates")
    public void addEstate(@RequestParam String estateName, @RequestParam String country) {
        Estate estate = new Estate(null, estateName, country, new ArrayList<>());
        estateService.save(estate);
    }
}
