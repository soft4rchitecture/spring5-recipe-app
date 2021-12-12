package guru.springframework.domain;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
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
  @OneToOne(cascade = CascadeType.ALL)
  private Notes notes;
}
