package me.iit.springwebalktest1.repository;

import me.iit.springwebalktest1.entity.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface RecipeRepository extends JpaRepository<Recipe, UUID> {
    //List<Recipe> saveNewRecipe(String)
}
