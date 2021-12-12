package guru.springframework.domain;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Entity
public class Recipe {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  Long id;

  @Getter
  private String description;
  @Getter
  private Integer prepTime;
  @Getter
  private Integer cookTime;
  @Getter
  private Integer servings;

  @Getter
  private String source;
  @Getter
  private String url;

  @Getter
  private String directions;

  @Getter
  @Lob
  private Byte[] image;

  @Getter
  @Enumerated(value = EnumType.STRING)
  private Difficulty difficulty;

  @Getter
  @OneToOne(cascade = CascadeType.ALL)
  private Notes notes;

  @OneToMany(cascade = CascadeType.ALL, mappedBy = "recipe")
  private Set<Ingredient> ingredient;

  @ManyToMany
  @JoinTable(//
      name = "recipe_category", //
      joinColumns = @JoinColumn(name = "recipe_id"), //
      inverseJoinColumns = @JoinColumn(name = "category_id"))
  private Set<Category> categories;
}
