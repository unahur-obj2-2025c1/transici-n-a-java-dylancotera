package Planetas;

import java.util.List;
import java.util.stream.Collectors;

import Personas.Persona;

public class Planeta {
	private List<Persona> habitantes;
	private Integer museos = 0;
	private Integer murallas = 0;
	
	
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
	
	public void construirMurallas(Integer cantidad) {
		murallas = murallas + cantidad;
	}
	
	public void fundarMuseo() {
		museos += 1;
	}
	
	public Integer potenciaAparente() {
		return habitantes.stream().mapToInt(p -> p.potencia()).max().orElse(0) * habitantes.size();

	}
	
	public Boolean necesitaReforzanse() {
		return this.potenciaAparente()  > this.potenciaReal() * 2;
	}
	
	public void recibirTributos() {
		habitantes.stream().forEach(p -> p.ofrecerTributo(this));
	}
	
	public List<Persona> habitantesValiosos() {
		return habitantes.stream().filter(p -> p.valor() >= 40).toList();
	}
	
	public void apaciguar(Planeta planeta) {
		this.habitantesValiosos().stream().forEach(p -> p.ofrecerTributo(planeta));
		
	}
}
