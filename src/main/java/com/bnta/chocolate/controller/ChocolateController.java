package com.bnta.chocolate.controller;

import com.bnta.chocolate.models.Chocolate;
import com.bnta.chocolate.service.ChocolateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ChocolateController {

    @Autowired
    private ChocolateService chocolateService;

    @GetMapping("/chocolates")
    public List<Chocolate> getAll() {
        return chocolateService.getAll();
    }

    @GetMapping("/chocolate/{id}")
    public Optional<Chocolate> getIndividualChocolate(@PathVariable int id) {
        return chocolateService.getIndividualChocolate(id);
    }

//    @PostMapping("/chocolates")
//    public void save(@RequestBody Chocolate chocolate) {
//        chocolateService.save(chocolate);
//    }
}
