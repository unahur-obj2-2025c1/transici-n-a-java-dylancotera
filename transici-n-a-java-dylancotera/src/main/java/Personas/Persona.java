package Personas;

public class Persona {
	private Integer edad;
	
	public Persona(Integer edad){
		this.edad = edad;
	}
	
	public Integer potencia() {
		return 20;
	}
	
	public Integer inteligencia() {
		if (this.edad >= 20 && this.edad <= 40) {
			return 12;
		}
		else {
			return 8;
		}
	}
	
	public Boolean esDestacado() {
		return edad == 25 || edad == 35;
	}
}
