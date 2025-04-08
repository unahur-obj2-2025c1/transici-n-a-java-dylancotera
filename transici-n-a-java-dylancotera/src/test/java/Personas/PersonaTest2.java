package Personas;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PersonaTest2 {
	private PerAtletas perla = new PerAtletas(28,6,4);
	
	@BeforeEach
	private void init() {
		perla.entrenar(15);
		perla.aprenderTecnica();
	}
	
	@Test
	void testPerla() {
		assertEquals(65, perla.potencia());
		assertFalse(perla.esDestacado());
	}
	
	@Test
	void testPerla2() {
		perla.aprenderTecnica();
		assertTrue(perla.esDestacado());
	}
}
