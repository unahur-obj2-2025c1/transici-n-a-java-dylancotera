package Planetas;





import java.util.List;
import java.util.stream.Collectors;

import Personas.Persona;

public class Planeta {
	private List<Persona> habitantes;
	private Integer museos = 0;
	
	
	
	public Planeta(List<Persona> habitantes, Integer museos) {
		super();
		this.habitantes = habitantes;
		this.museos = museos;
	}

	
	public Planeta(List<Persona> habitantes) {
		super();
		this.habitantes = habitantes;
	}


	public List<Persona> delegacionDiplomatica(){
		return habitantes.stream().filter(p -> p.esDestacado()).collect(Collectors.toList());
	}
	
	public Long valorInicialDefensa() {
		return habitantes.stream().filter(p -> p.potencia() >= 30).count();
	}
	
	public Boolean esCulto() {
		return museos >= 2 && 
				habitantes.stream().allMatch(p -> p.inteligencia() >= 10);
	}
	
	public Integer potenciaReal() {
		return habitantes.stream().mapToInt(p -> p.potencia()).sum();
	}
}
