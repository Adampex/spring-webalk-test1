package me.iit.springwebalktest1.controller.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import me.iit.springwebalktest1.service.dto.Recipe;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotEmpty;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreateRecipeDto {

    @NotEmpty
    private String recipeName;

    @NotEmpty
    private String ingredient;
    @NotEmpty
    private String quantity;

    public Recipe toRecipe() {
        return new Recipe(null, recipeName, ingredient, quantity);
    }
}
