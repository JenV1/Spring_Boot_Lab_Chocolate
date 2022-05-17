package com.bnta.chocolate.repositories;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ChocolateRepositoryTest {

    @Autowired
    ChocolateRepository chocolateRepository;

    @Test
    void testQueryMethod() {
        assertEquals(2, chocolateRepository.cocoaMoreThan60Percent(60).size());
    }
}