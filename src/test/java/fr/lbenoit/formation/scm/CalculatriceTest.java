package fr.lbenoit.formation.scm;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatriceTest {

	Calculatrice calculette;
	
	@BeforeEach
	void initialise() {
		calculette = new Calculatrice();
	}
	
	@Test
	void testAddition() {
		Assertions.assertEquals(8, calculette.addition(3, 5));
		Assertions.assertEquals(8, calculette.addition(5, 3));
		Assertions.assertEquals(2, calculette.addition(0, 2));
		Assertions.assertEquals(27, calculette.addition(2, 25));
	}
}
