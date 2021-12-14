package guru.springframework.services;

import java.util.Set;

import guru.springframework.domain.Owner;

public interface OwnerService {

  Owner findByLastName(String lastname);

  Set<Owner> findAll();

  Owner findById(Long id);

  Owner save(Owner owner);

  void delete(Owner owner);

  void deleteById(Long id);

}
