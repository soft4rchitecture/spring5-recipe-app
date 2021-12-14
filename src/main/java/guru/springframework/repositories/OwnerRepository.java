package guru.springframework.repositories;

import org.springframework.data.repository.CrudRepository;

import guru.springframework.domain.Owner;

public interface OwnerRepository extends CrudRepository<Owner, Long> {

}
