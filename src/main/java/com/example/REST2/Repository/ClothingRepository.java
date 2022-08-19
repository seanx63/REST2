package com.example.REST2.Repository;

import com.example.REST2.Entity.Clothing;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ClothingRepository extends JpaRepository<Clothing, Long> {

    @Query("SELECT p FROM Clothing p WHERE " +
            "p.name LIKE CONCAT('%',:query, '%')" +
            "Or p.brand LIKE CONCAT('%', :query, '%')")
    List<Clothing> searchClothing(String query);
}