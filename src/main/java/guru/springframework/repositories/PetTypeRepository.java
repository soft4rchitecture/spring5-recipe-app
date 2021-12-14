package guru.springframework.repositories;

import org.springframework.data.repository.CrudRepository;

import guru.springframework.domain.PetType;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {
  
}
