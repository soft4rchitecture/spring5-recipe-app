package guru.springframework.controllers;

import java.util.HashSet;
import java.util.Set;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import guru.springframework.domain.Recipe;
import guru.springframework.repositories.RecipeRepository;
import lombok.AllArgsConstructor;

/**
 * Created by jt on 6/1/17.
 */
@AllArgsConstructor
@Controller
public class IndexController {

    private RecipeRepository recipesRepository;

    @RequestMapping({ "", "/", "/index" })
    public String getIndexPage(Model model) {

        Set<Recipe> recipes = new HashSet<>();
        recipesRepository.findAll().forEach(recipes::add);
        model.addAttribute("recipes", recipes);
        return "index";
    }
}
