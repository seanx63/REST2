package com.example.REST2.Controller;

import com.example.REST2.Entity.Clothing;
import com.example.REST2.Service.ClothingService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/clothing")
public class ClothingController {

    private final ClothingService clothingService;

    public ClothingController(ClothingService clothingService) {
        this.clothingService = clothingService;
    }

    @GetMapping("/search")
    public ResponseEntity<List<Clothing>> searchEmployees(@RequestParam("query") String query){
        return ResponseEntity.ok(clothingService.searchClothing(query));
    }

    @PostMapping
    public Clothing createEmployee(@RequestBody Clothing clothing){
        return clothingService.createClothing(clothing);
    }
}