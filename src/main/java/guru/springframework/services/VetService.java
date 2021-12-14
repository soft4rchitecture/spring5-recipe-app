package guru.springframework.services;

import java.util.Set;

import guru.springframework.domain.Vet;

public interface VetService {

  Set<Vet> findAll();

  Vet findById(Long id);

  Vet save(Vet vet);

  void delete(Vet vet);

  void deleteById(Long id);

}
