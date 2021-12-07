package me.iit.springwebalktest1.controller.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import me.iit.springwebalktest1.service.dto.Recipe;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RecipeDto {

    private UUID recipeId;
    private String recipeName;
    private String ingredient;
    private String quantity;

    public Recipe toServiceDto() {
        return new Recipe(recipeId, recipeName, ingredient, quantity);
    }

    public RecipeDto(Recipe recipe) {
        this.recipeId = recipe.getRecipeId();
        this.recipeName = recipe.getRecipeName();
        this.ingredient = recipe.getIngredient();
        this.quantity = recipe.getQuantity();
    }
}
