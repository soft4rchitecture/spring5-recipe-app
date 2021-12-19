package guru.springframework.services;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import guru.springframework.domain.Recipe;
import guru.springframework.repositories.RecipeRepository;
import guru.springframework.shared.RecipesBaseTests;

class RecipeServiceImplTest extends RecipesBaseTests {

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

}
