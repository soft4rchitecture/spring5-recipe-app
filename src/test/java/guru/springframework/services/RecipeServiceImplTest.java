package guru.springframework.services;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.when;

import java.util.HashSet;
import java.util.Set;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import guru.springframework.domain.Recipe;
import guru.springframework.repositories.RecipeRepository;

class RecipeServiceImplTest {

	@Mock
	private RecipeRepository recipeRepository;
	private RecipeService recipeService;

	@BeforeEach
	public void setUp() {
		MockitoAnnotations.openMocks(this);
		when(recipeRepository.findAll()).thenReturn(newDefaultRecipe());
		recipeService = new RecipeServiceImpl(recipeRepository);
	}

	@Test
	void getRecipesReturnsTheRecipesProvidedByTheRecipeRepository() {
		assertTrue(recipeService.getRecipes().contains(new Recipe()));
	}

	private Set<Recipe> newDefaultRecipe() {
		Set<Recipe> recipes = new HashSet<Recipe>();
		recipes.add(new Recipe());
		return recipes;
	}

}
