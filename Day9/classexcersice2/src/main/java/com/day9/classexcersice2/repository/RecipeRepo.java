package com.day9.classexcersice2.repository;
import com.day9.classexcersice2.model.*;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface RecipeRepo extends CrudRepository<Recipe, Integer> {

    List<Recipe> findByRecipeName(String recipeName);
}