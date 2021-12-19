package guru.springframework.repositories;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import guru.springframework.domain.UnitOfMeasure;

@DataJpaTest
class UnitOfMeasureRepositoryIT {

	@Autowired
	private UnitOfMeasureRepository unitOfMeasureRepository;

	@Test
	void findByDescription() {
		Optional<UnitOfMeasure> unitOfMeasure = unitOfMeasureRepository.findByDescription("Teaspoon");
		assertEquals("Teaspoon", unitOfMeasure.get().getDescription());
	}
	
	@Test
	void findCupByDescription() {
		Optional<UnitOfMeasure> unitOfMeasure = unitOfMeasureRepository.findByDescription("Cup");
		assertEquals("Cup", unitOfMeasure.get().getDescription());
	}

}
