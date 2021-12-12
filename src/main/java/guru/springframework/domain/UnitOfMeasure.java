package guru.springframework.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;

@Entity
public class UnitOfMeasure {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  Long id;

  @Getter
  private String description;
}
