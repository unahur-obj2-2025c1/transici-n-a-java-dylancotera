package Personas;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

import Planetas.Planeta;



public class PersonaTest {
	private Persona julieta = new Persona(42);
	private PerAtletas ana = new PerAtletas(25);
	private PerAtletas rosa = new PerAtletas(45,8);
	private PerAtletas perla = new PerAtletas(28,6,4);
	private PerDocentes monica = new PerDocentes(45,6);
	private PerDocentes luisa = new PerDocentes(35,1);
	
	private Planeta triton = new Planeta(Arrays.asList(julieta,ana,rosa,perla,monica,luisa));
	
	
	@Test
	void testValoresJulieta() {
		assertEquals(20, julieta.potencia());
		assertEquals(8, julieta.inteligencia());
		assertFalse(julieta.esDestacado());
	}
	@Test
	void testValoresAna() {
		assertEquals(28, ana.potencia());
		assertEquals(12, ana.inteligencia());
		assertTrue(ana.esDestacado());
	}
	@Test
	void testValoresRosa() {
		assertEquals(52, rosa.potencia());
		assertEquals(8, rosa.inteligencia());
		assertTrue(rosa.esDestacado());
	}
	@Test
	void testValoresPerla() {
		assertEquals(44, perla.potencia());
		assertEquals(12, perla.inteligencia());
		assertFalse(perla.esDestacado());
	}
	@Test
	void testValoresMonica() {
		assertEquals(20, monica.potencia());
		assertEquals(20, monica.inteligencia());
		assertTrue(monica.esDestacado());
	}
	@Test
	void testValoresLuisa() {
		assertEquals(20, luisa.potencia());
		assertEquals(14, luisa.inteligencia());
		assertFalse(luisa.esDestacado());
	}
	
	@Test
	void testPlanetaTriton() {
		List<Persona> esperada = Arrays.asList(ana,rosa,monica);
		assertEquals(esperada, triton.delegacionDiplomatica());
		
		assertEquals(2, triton.valorInicialDefensa());
		assertFalse(triton.esCulto());
		assertEquals(184, triton.potenciaReal());
	}
	
}


