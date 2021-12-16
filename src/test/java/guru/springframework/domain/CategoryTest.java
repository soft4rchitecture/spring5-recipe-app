package guru.springframework.domain;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CategoryTest {

	private final Category category = new Category();
	private long dATABASE_ID = 10L;
	
	@Test
	void getId() {
		category.setId(dATABASE_ID );
		assertEquals(category.getId(), dATABASE_ID );
	}

}
