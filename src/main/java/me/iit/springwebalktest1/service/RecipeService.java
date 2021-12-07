package me.iit.springwebalktest1.service;

import me.iit.springwebalktest1.service.dto.Recipe;

public interface RecipeService {

    Iterable<Recipe> getAllRecipe();
    Recipe create(Recipe recipe);
}
