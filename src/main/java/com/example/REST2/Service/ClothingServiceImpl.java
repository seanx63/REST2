package com.example.REST2.Service;


import com.example.REST2.Entity.Clothing;
import com.example.REST2.Repository.ClothingRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClothingServiceImpl implements ClothingService {
    private final ClothingRepository clothingRepository;

    public ClothingServiceImpl(ClothingRepository clothingRepository) {
        this.clothingRepository = clothingRepository;
    }

    @Override
    public List<Clothing> searchClothing(String query) {
        return clothingRepository.searchClothing(query);
    }

    @Override
    public Clothing createClothing(Clothing clothing) {
        return clothingRepository.save(clothing);
    }
}