package me.iit.springwebalktest1.controller;

import me.iit.springwebalktest1.controller.dto.CreateRecipeDto;
import me.iit.springwebalktest1.controller.dto.RecipeDto;
import me.iit.springwebalktest1.service.RecipeService;
import me.iit.springwebalktest1.service.dto.Recipe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@RestController
public class RecipeController {

    private final RecipeService recipeService;

    @Autowired
    public RecipeController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @GetMapping
    public Iterable<RecipeDto> getAllRecipe() {
        List<RecipeDto> recipeDtoList = new ArrayList<>();

        for(Recipe recipe : recipeService.getAllRecipe()) {
            recipeDtoList.add(new RecipeDto(recipe));
        }
        return recipeDtoList;
    }

    @PostMapping(path = "/newRecipe", produces = MediaType.APPLICATION_JSON_VALUE)
    public RecipeDto saveNewRecipe(@RequestBody @Valid CreateRecipeDto createRecipeDto) {
        return new RecipeDto(recipeService.create(createRecipeDto.toRecipe()));
    }
}
