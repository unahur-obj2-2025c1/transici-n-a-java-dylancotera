package Armas;

import Personas.PerSoldado;

public class Pistolete implements Arma {
	private Integer largo;
	
	@Override
	public Integer potencia(PerSoldado soldado) {
		if (soldado.getEdad() > 30) {
			return largo * 3;
		}
		else {
			return largo * 2;
		}
	}
}
