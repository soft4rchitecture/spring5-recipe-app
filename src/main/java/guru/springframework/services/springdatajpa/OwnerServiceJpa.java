package guru.springframework.services.springdatajpa;

import java.util.HashSet;
import java.util.Set;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import guru.springframework.domain.Owner;
import guru.springframework.repositories.OwnerRepository;
import guru.springframework.services.OwnerService;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
@Profile("springdatajpa")
public class OwnerServiceJpa implements OwnerService {

  private final OwnerRepository ownerRepository;

  @Override
  public Owner findByLastName(String lastname) {
    return this.ownerRepository.findByLastName(lastname).get(0);
  }

  @Override
  public Set<Owner> findAll() {
    Set<Owner> owners = new HashSet<>();
    this.ownerRepository.findAll().forEach(owners::add);
    return owners;
  }

  @Override
  public Owner findById(Long id) {
    return this.ownerRepository.findById(id).orElse(null);
  }

  @Override
  public Owner save(Owner owner) {
    Owner savedOwner = this.ownerRepository.save(owner);
    return savedOwner;
  }

  @Override
  public void delete(Owner owner) {
    this.ownerRepository.delete(owner);

  }

  @Override
  public void deleteById(Long id) {
    this.ownerRepository.deleteById(id);

  }

}
