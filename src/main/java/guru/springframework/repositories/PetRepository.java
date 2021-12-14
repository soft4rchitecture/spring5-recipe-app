package guru.springframework.repositories;

import org.springframework.data.repository.CrudRepository;

import guru.springframework.domain.Pet;

public interface PetRepository extends CrudRepository<Pet, Long> {

}
