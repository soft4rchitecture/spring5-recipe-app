package guru.springframework.domain;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CategoryTest {

	private final Category category = new Category();
	private final long DATABASE_ID = 10L;
	
	@Test
	void getId() {
		category.setId(DATABASE_ID );
		assertEquals(category.getId(), DATABASE_ID );
	}

}
