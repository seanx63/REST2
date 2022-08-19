package com.example.REST2.Service;

import com.example.REST2.Entity.Clothing;

import java.util.List;

public interface ClothingService {
    List<Clothing> searchClothing(String query);

    Clothing createClothing(Clothing product);
}
