package Armas;

import Personas.PerSoldado;

public class Espadon implements Arma{
	
	private Integer peso;
	
	@Override
	public Integer potencia(PerSoldado soldado) {
		if(soldado.getEdad() < 40) {
			return peso / 2;
		}
		else {
			return 6;
		}
	}
}
