package com.bnta.chocolate.config;

import com.bnta.chocolate.models.Chocolate;
import com.bnta.chocolate.models.Estate;
import com.bnta.chocolate.repositories.ChocolateRepository;
import com.bnta.chocolate.repositories.EstateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Configuration;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Configuration
public class DBSeeder implements ApplicationRunner {

    @Autowired
    private EstateRepository estateRepository;


    @Override
    public void run(ApplicationArguments args) throws Exception {

        Estate e1 = new Estate(null, "est1", "count1", null);
        Estate e2 = new Estate(null, "est2", "count2", null);
        Estate e3 = new Estate(null, "est3", "count1", null);
        Estate e4 = new Estate(null, "est4", "count3", null);
        Estate e5 = new Estate(null, "est5", "count4", null);

        Chocolate c1 = new Chocolate(null, "choc1", 30, e1);
        Chocolate c11 = new Chocolate(null, "choc2", 50, e1);
        Chocolate c2 = new Chocolate(null, "choc3", 30, e2);
        Chocolate c22 = new Chocolate(null, "choc4", 80, e2);
        Chocolate c3 = new Chocolate(null, "choc5", 60, e3);
        Chocolate c33 = new Chocolate(null, "choc5", 60, e3);
        Chocolate c4 = new Chocolate(null, "choc5", 60, e4);
        Chocolate c44 = new Chocolate(null, "choc5", 60, e4);
        Chocolate c5 = new Chocolate(null, "choc5", 60, e5);
        Chocolate c55 = new Chocolate(null, "choc5", 60, e5);

        e1.setChocolates(List.of(c1,c11));
        e2.setChocolates(List.of(c2,c22));
        e3.setChocolates(List.of(c3,c33));
        e4.setChocolates(List.of(c4,c44));
        e5.setChocolates(List.of(c5,c55));


        estateRepository.saveAll(List.of(e1,e2,e3,e4,e5));


    }
}

