package com.bnta.chocolate.controller;

import com.bnta.chocolate.models.Chocolate;
import com.bnta.chocolate.repositories.EstateRepository;
import com.bnta.chocolate.service.ChocolateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ChocolateController {

    @Autowired
    private ChocolateService chocolateService;

    @Autowired
    private EstateRepository estateRepository;
    
    @GetMapping("/chocolate/{id}")
    public Optional<Chocolate> getIndividualChocolate(@PathVariable int id) {
        return chocolateService.getIndividualChocolate(id);
    }

    @PostMapping("/chocolates")
    @ResponseBody
    public void save(@RequestParam String chocolateName, @RequestParam int cocoaPercentage, @RequestParam Long estateID) {
        Chocolate chocolate = new Chocolate(null, chocolateName, cocoaPercentage, estateRepository.getById(estateID));
        chocolateService.save(chocolate);
    }

    @RequestMapping(value = "chocolates", method = RequestMethod.GET)
    public @ResponseBody List<Chocolate> getChocolateOverCocoaPercentage(@RequestParam(value = "cocoaPercentage", defaultValue = "0") int percentage) {
        return chocolateService.getChocolateOverCocoaPercentage(percentage);
    }
}
