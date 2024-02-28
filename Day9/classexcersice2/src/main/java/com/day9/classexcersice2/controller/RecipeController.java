package com.day9.classexcersice2.controller;
import com.day9.classexcersice2.model.*;
import com.day9.classexcersice2.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/recipe")
public class RecipeController {

    @Autowired
    private RecipeService recipeService;

    @PostMapping
    public ResponseEntity<Recipe> addRecipe(@RequestBody Recipe recipe) {
        Recipe createdRecipe = recipeService.addRecipe(recipe);
        if (createdRecipe != null) {
            return new ResponseEntity<>(createdRecipe, HttpStatus.CREATED);
        } else {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/byname")
    public ResponseEntity<List<Recipe>> getRecipeByName(@RequestParam String recipeName) {
        List<Recipe> recipes = recipeService.getRecipeByName(recipeName);
        if (!recipes.isEmpty()) {
            return new ResponseEntity<>(recipes, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/{recipeId}")
    public ResponseEntity<Recipe> getRecipeById(@PathVariable int recipeId) {
        Recipe recipe = recipeService.getRecipeById(recipeId);
        if (recipe != null) {
            return new ResponseEntity<>(recipe, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}