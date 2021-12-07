package me.iit.springwebalktest1.service;

import me.iit.springwebalktest1.repository.RecipeRepository;
import me.iit.springwebalktest1.service.dto.Recipe;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class RecipeServiceImpl implements RecipeService {

    private final RecipeRepository recipeRepository;

    public RecipeServiceImpl(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }

    public Recipe create(Recipe recipe) {
        return new Recipe(recipeRepository.save(recipe.toEntity()));
    }

    public Iterable<Recipe> getAllRecipe() {
        return StreamSupport.stream(recipeRepository.findAll().spliterator(), false)
                .map(Recipe::new).collect(Collectors.toList());
    }
}
