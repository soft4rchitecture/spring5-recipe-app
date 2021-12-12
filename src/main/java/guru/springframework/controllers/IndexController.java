package guru.springframework.controllers;

import java.util.Optional;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import guru.springframework.domain.Category;
import guru.springframework.domain.UnitOfMeasure;
import guru.springframework.repositories.CategoryRepository;
import guru.springframework.repositories.UnitOfMeasureRepository;
import lombok.AllArgsConstructor;

/**
 * Created by jt on 6/1/17.
 */
@AllArgsConstructor
@Controller
public class IndexController {

    private CategoryRepository categoryRepository;
    private UnitOfMeasureRepository unitOfMeasureRepository;

    @RequestMapping({ "", "/", "/index" })
    public String getIndexPage() {

        Optional<Category> category = this.categoryRepository.findByDescription("American");
        Optional<UnitOfMeasure> unitOfMeasure = unitOfMeasureRepository.findByDescription("Teaspoon");

        System.out.println("category description: " + category.get().getDescription());
        System.out.println("unitOfMeasure description: " + unitOfMeasure.get().getDescription());

        return "index";
    }
}
