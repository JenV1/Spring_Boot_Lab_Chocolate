package com.bnta.chocolate.config;

import com.bnta.chocolate.models.Chocolate;
import com.bnta.chocolate.models.Estate;
import com.bnta.chocolate.repositories.EstateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class DBSeeder implements ApplicationRunner {

    @Autowired
    private EstateRepository estateRepository;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Estate estate1 = new Estate(null, "UK_Estate", "UK", null);
        Estate estate2 = new Estate(null, "US_Estate", "US", null);
        Estate estate3 = new Estate(null, "Japan_Estate", "Japan", null);
        Estate estate4 = new Estate(null, "Canada_Estate", "Canada", null);
        Estate estate5 = new Estate(null, "France_Estate", "France", null);

        Chocolate chocolate1 = new Chocolate(null, "Name1", 20, estate1);
        Chocolate chocolate2 = new Chocolate(null, "Name2", 30, estate1);
        Chocolate chocolate3 = new Chocolate(null, "Name3", 39, estate2);
        Chocolate chocolate4 = new Chocolate(null, "Name4", 100, estate2);
        Chocolate chocolate5 = new Chocolate(null, "Name5", 50, estate3);
        Chocolate chocolate6 = new Chocolate(null, "Name6", 45, estate3);
        Chocolate chocolate7 = new Chocolate(null, "Name7", 21, estate4);
        Chocolate chocolate8 = new Chocolate(null, "Name8", 10, estate4);
        Chocolate chocolate9 = new Chocolate(null, "Name9", 58, estate5);
        Chocolate chocolate10 = new Chocolate(null, "Name10", 30, estate5);

        estate1.setChocolates(List.of(chocolate1, chocolate2));
        estate2.setChocolates(List.of(chocolate3, chocolate4));
        estate3.setChocolates(List.of(chocolate5, chocolate6));
        estate4.setChocolates(List.of(chocolate7, chocolate8));
        estate5.setChocolates(List.of(chocolate9, chocolate10));

        estateRepository.saveAll(List.of(estate1, estate2, estate3, estate4, estate5));
    }
}