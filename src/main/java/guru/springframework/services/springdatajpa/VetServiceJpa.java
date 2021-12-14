package guru.springframework.services.springdatajpa;

import java.util.HashSet;
import java.util.Set;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import guru.springframework.domain.Vet;
import guru.springframework.repositories.VetRepository;
import guru.springframework.services.VetService;
import lombok.AllArgsConstructor;

@Service
@Profile("springdatajpa")
@AllArgsConstructor
public class VetServiceJpa implements VetService {

  private final VetRepository vetRepository;

  @Override
  public Set<Vet> findAll() {
    Set<Vet> vets = new HashSet<>();
    this.vetRepository.findAll().forEach(vets::add);
    return vets;
  }

  @Override
  public Vet findById(Long id) {
    return this.vetRepository.findById(id).orElse(null);
  }

  @Override
  public Vet save(Vet vet) {
    return this.vetRepository.save(vet);
  }

  @Override
  public void delete(Vet vet) {
    this.vetRepository.delete(vet);

  }

  @Override
  public void deleteById(Long id) {
    this.vetRepository.deleteById(id);
  }

}
