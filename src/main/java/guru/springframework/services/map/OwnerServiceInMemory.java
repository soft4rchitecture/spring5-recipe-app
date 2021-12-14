package guru.springframework.services.map;

import java.util.Set;

import org.springframework.stereotype.Service;

import guru.springframework.domain.Owner;
import guru.springframework.services.OwnerService;

@Service
public class OwnerServiceInMemory implements OwnerService {

  @Override
  public Owner findByLastName(String lastname) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Set<Owner> findAll() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Owner findById(Long id) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Owner save(Owner owner) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public void delete(Owner owner) {
    // TODO Auto-generated method stub

  }

  @Override
  public void deleteById(Long id) {
    // TODO Auto-generated method stub

  }

}
