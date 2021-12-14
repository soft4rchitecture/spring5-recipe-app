package guru.springframework.repositories;

import org.springframework.data.repository.CrudRepository;

import guru.springframework.domain.Visit;

public interface VisitRepository  extends CrudRepository<Visit, Long>{
  
}
