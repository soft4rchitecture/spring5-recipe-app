package guru.springframework.services.map;

import java.util.Set;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import guru.springframework.domain.Visit;
import guru.springframework.services.VisitService;

@Service
@Profile({ "default", "map" })
public class VisitServiceInMemory implements VisitService {

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
    if (visit.getPet() == null || visit.getPet().getOwner() == null || visit.getPet().getId() == null
        || visit.getPet().getOwner().getId() == null) {
      throw new RuntimeException("Invalid Visit");
    }
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
