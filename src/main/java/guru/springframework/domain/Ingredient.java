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
  @ManyToOne
  private Recipe recipe;

  @Getter
  private String description;

  @Getter
  private BigDecimal amount;

  @Getter
  @ManyToOne(optional = false)
  private UnitOfMeasure unitOfMeasure;

}
