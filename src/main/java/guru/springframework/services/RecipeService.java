package guru.springframework.services;

import guru.springframework.domain.Recipe;

import java.util.Set;

/**
 * Created by Onalethata I. L. Maswabi
 * AKA Inno607
 */

public interface RecipeService {
    Set<Recipe> getRecipes();
}
