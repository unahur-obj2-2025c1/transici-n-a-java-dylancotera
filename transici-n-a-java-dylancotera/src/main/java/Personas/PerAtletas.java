package Personas;

import Planetas.Planeta;

public class PerAtletas extends Persona {

	private Integer masaMuscular = 4;
	private Integer tecnicas = 2;
	
	public PerAtletas(Integer edad) {
		super(edad);
	}
	
	
	public PerAtletas(Integer edad, Integer tecnicas) {
		super(edad);
		this.tecnicas = tecnicas;
	}

	public PerAtletas(Integer edad, Integer masaMuscular, Integer tecnicas) {
		super(edad);
		this.masaMuscular = masaMuscular;
		this.tecnicas = tecnicas;
	}

	public Integer potencia() {
		return super.potencia() + this.masaMuscular * this.tecnicas;
	}
	
	public Boolean esDestacado() {
		return super.esDestacado() || tecnicas > 5;
	}
	
	public void entrenar(Integer cantidad) {
		masaMuscular = masaMuscular + cantidad / 5;
	}
	
	public void aprenderTecnica() {
		tecnicas += 1;
	}
	
	@Override
	public void ofrecerTributo(Planeta planeta) {
		planeta.construirMurallas(2);
	}
}
