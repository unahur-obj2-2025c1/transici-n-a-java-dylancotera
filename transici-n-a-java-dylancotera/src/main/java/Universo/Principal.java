package Universo;

import static org.junit.jupiter.api.Assertions.assertFalse;

import java.util.Arrays;
import java.util.List;

import Personas.PerAtletas;
import Personas.PerDocentes;
import Personas.Persona;
import Planetas.Planeta;

public class Principal {

	public static void main(String[] args) {
		Persona julieta = new Persona(42);
		PerAtletas ana = new PerAtletas(25);
		PerAtletas rosa = new PerAtletas(45,8);
		PerAtletas perla = new PerAtletas(28,6,4);
		PerDocentes monica = new PerDocentes(45,6);
		PerDocentes luisa = new PerDocentes(35,1);
		
		Planeta triton = new Planeta(Arrays.asList(julieta,ana,rosa,perla,monica,luisa));
		
		System.out.println(triton.potenciaReal());
		
	}

}
