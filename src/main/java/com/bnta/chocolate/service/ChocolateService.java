package com.bnta.chocolate.service;

import com.bnta.chocolate.models.Chocolate;
import com.bnta.chocolate.repositories.ChocolateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ChocolateService {

    @Autowired
    private ChocolateRepository chocolateRepository;

    public List<Chocolate> getAll() {
        return chocolateRepository.findAll();
    }

    public void save(Chocolate chocolate) {
        chocolateRepository.save(chocolate);
    }

    public Optional<Chocolate> getIndividualChocolate(int id) {
        return chocolateRepository.findById((long) id);
    }

    public List<Chocolate> getChocolateOverCocoaPercentage(int percentage) {
        return chocolateRepository.cocoaMoreThan60Percent(percentage);
    }
}
