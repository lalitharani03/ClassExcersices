package com.day9.classexcersice2.service;

import com.day9.classexcersice2.model.*;
import com.day9.classexcersice2.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecipeService {

    @Autowired
    private RecipeRepo recipeRepo;

    public Recipe addRecipe(Recipe recipe) {
        return recipeRepo.save(recipe);
    }

    public List<Recipe> getRecipeByName(String recipeName) {
        return recipeRepo.findByRecipeName(recipeName);
    }

    public Recipe getRecipeById(int recipeId) {
        return recipeRepo.findById(recipeId).orElse(null);
    }
}
