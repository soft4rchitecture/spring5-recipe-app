package guru.springframework.domain;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Getter;

@Entity
public class Ingredient {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  Long id;

  @Getter
  private String description;

  @Getter
  private BigDecimal amount;

  @Getter
  @ManyToOne(optional = false)
  private UnitOfMeasure unitOfMeasure;

  @Getter
  @ManyToOne
  private Recipe recipe;


  public Ingredient(String description, BigDecimal amount, UnitOfMeasure uom, Recipe recipe) {
    this.description = description;
    this.amount = amount;
    unitOfMeasure = uom;
    this.recipe = recipe;

  }

}
