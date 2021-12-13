package guru.springframework.domain;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.EqualsAndHashCode;
import lombok.Value;

@Entity
@Table(name = "visits")
@Value
@EqualsAndHashCode(callSuper = false)
public class Visit extends BaseEntity {

  @Column(name = "date")
  LocalDate date;
  @Column(name = "description")
  String description;
  @ManyToOne
  @JoinColumn(name = "pet_id")
  Pet pet;

}
