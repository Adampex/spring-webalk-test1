package me.iit.springwebalktest1.service.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Optional;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Recipe {

    private UUID recipeId;
    private String recipeName;
    private String ingredient;
    private String quantity;

    public Recipe(Optional<me.iit.springwebalktest1.entity.Recipe> recipeEntity) {
        this.recipeId = recipeEntity.get().getRecipeId();
        this.recipeName = recipeEntity.get().getRecipeName();
        this.ingredient = recipeEntity.get().getIngredient();
        this.quantity = recipeEntity.get().getQuantity();
    }

    public me.iit.springwebalktest1.entity.Recipe toEntity() {
        return new me.iit.springwebalktest1.entity.Recipe(recipeId, recipeName, ingredient, quantity);
    }

    public Recipe(me.iit.springwebalktest1.entity.Recipe recipeEntity) {
        this.recipeId = recipeEntity.getRecipeId();
        this.recipeName = recipeEntity.getRecipeName();
        this.ingredient = recipeEntity.getIngredient();
        this.quantity = recipeEntity.getQuantity();
    }
}
