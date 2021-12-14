package guru.springframework.services;

import java.util.Set;

import guru.springframework.domain.Visit;

public interface VisitService {

  Set<Visit> findAll();

  Visit findById(Long id);

  Visit save(Visit visit);

  void delete(Visit visit);

  void deleteById(Long id);

}
