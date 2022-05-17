package com.bnta.chocolate.repositories;

import com.bnta.chocolate.models.Chocolate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ChocolateRepository extends JpaRepository<Chocolate, Long> {

    @Query(value = "SELECT * FROM CHOCOLATE WHERE CHOCOLATE.COCOA_PERCENTAGE>= :cocoaPercent", nativeQuery = true)
    public List<Chocolate> cocoaMoreThan60Percent(@Param("cocoaPercent") int cocoaPercent);

}
