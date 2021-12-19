package guru.springframework.controllers;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.mockito.MockitoAnnotations.openMocks;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.ui.Model;

import guru.springframework.services.RecipeService;
import guru.springframework.shared.RecipesBaseTests;

class IndexControllerTest extends RecipesBaseTests{

	@Mock
	private RecipeService recipeService;
	@Mock 
	private Model model;
	private IndexController indexController;

	@BeforeEach
	public void setUp() {
		openMocks(this);
		when(recipeService.getRecipes()).thenReturn(newDefaultRecipe());
		indexController = new IndexController(recipeService);
	}
	@Test
	void getIndexPageCallsFillsRecipesKeyInModelUsingRecipeService() {
		indexController.getIndexPage(model);
		verify(model).addAttribute("recipes", newDefaultRecipe());
	}
	
	@Test
	void getIndexPageReturnsIndexAsPage() {
		assertEquals("index", indexController.getIndexPage(model));
	}

}
