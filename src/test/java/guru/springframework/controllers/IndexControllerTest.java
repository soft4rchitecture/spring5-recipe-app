package guru.springframework.controllers;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.mockito.MockitoAnnotations.openMocks;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

import java.util.Set;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcBuilder;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.test.web.servlet.setup.StandaloneMockMvcBuilder;
import org.springframework.ui.Model;

import guru.springframework.domain.Recipe;
import guru.springframework.services.RecipeService;
import guru.springframework.shared.RecipesBaseTests;

class IndexControllerTest extends RecipesBaseTests {

	@Mock
	private RecipeService recipeService;
	@Mock
	private Model model;
	private IndexController indexController;
	private ArgumentCaptor<Set<Recipe>> argumentsCaptor;
	private MockMvc mockMvc;


	@BeforeEach
	public void setUp() {
		openMocks(this);
		when(recipeService.getRecipes()).thenReturn(newDefaultRecipe());
		indexController = new IndexController(recipeService);
		argumentsCaptor = ArgumentCaptor.forClass(Set.class);
		mockMvc = MockMvcBuilders.standaloneSetup(indexController).build();
	}

	@Test
	void mockMvc() throws Exception {
		mockMvc.perform(get("/"))//
		.andExpect(status().isOk())//
		.andExpect(view().name("index"));
	}

	@Test
	void getIndexPageCallsFillsRecipesKeyInModelUsingRecipeService() {
		indexController.getIndexPage(model);
		verify(model).addAttribute(eq("recipes"), argumentsCaptor.capture());
		assertEquals(newDefaultRecipe(), argumentsCaptor.getValue());
	}

	@Test
	void getIndexPageReturnsIndexAsPage() {
		assertEquals("index", indexController.getIndexPage(model));
	}

}
