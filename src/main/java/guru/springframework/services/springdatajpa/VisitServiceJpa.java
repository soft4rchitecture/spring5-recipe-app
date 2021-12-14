package guru.springframework.services.springdatajpa;

import java.util.Set;

import org.springframework.stereotype.Service;

import guru.springframework.domain.Visit;
import guru.springframework.services.VisitService;

@Service
public class VisitServiceJpa implements VisitService {

  @Override
  public Set<Visit> findAll() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Visit findById(Long id) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Visit save(Visit visit) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public void delete(Visit visit) {
    // TODO Auto-generated method stub

  }

  @Override
  public void deleteById(Long id) {
    // TODO Auto-generated method stub

  }

}
