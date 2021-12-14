package guru.springframework.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import guru.springframework.domain.Owner;

public interface OwnerRepository extends CrudRepository<Owner, Long> {

  List<Owner> findByLastName(String lastname);

}
