package guru.springframework.domain;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
@Entity
@Table(name = "specialities")
public class Speciality extends BaseEntity {
  private final String description;
}
