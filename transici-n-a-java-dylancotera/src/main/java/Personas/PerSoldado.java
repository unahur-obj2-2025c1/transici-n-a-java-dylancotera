package Personas;

import Planetas.Planeta;

import java.util.List;

import Armas.Arma;

public class PerSoldado extends Persona {

	private List<Arma> armas;
	
	public PerSoldado(Integer edad) {
		super(edad);
	}
	
	@Override
	public Integer potencia() {
		return super.potencia() + armas.stream().mapToInt(a -> a.potencia(this)).sum();
	}

	@Override
	public void ofrecerTributo(Planeta planeta) {
		planeta.construirMurallas(5);
	}
}
