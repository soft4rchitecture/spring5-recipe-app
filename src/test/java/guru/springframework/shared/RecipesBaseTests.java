package guru.springframework.shared;

import java.util.HashSet;
import java.util.Set;

import guru.springframework.domain.Recipe;

public class RecipesBaseTests {

	public RecipesBaseTests() {
		super();
	}

	protected Set<Recipe> newDefaultRecipe() {
		Set<Recipe> recipes = new HashSet<Recipe>();
		recipes.add(new Recipe());
		return recipes;
	}

}