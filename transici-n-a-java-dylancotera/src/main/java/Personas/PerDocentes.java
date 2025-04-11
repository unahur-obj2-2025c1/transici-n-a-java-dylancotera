package Personas;

import Planetas.Planeta;

public class PerDocentes extends Persona {

	private Integer cursos = 0;
	
	public PerDocentes(Integer edad) {
		super(edad);
	}

	public PerDocentes(Integer edad, Integer cursos) {
		super(edad);
		this.cursos = cursos;
	}
	
	public Integer inteligencia() {
		return super.inteligencia() + cursos * 2;
	}
	
	public Boolean esDestacado() {
		return cursos > 3;
	}
	
	@Override
	public void ofrecerTributo(Planeta planeta) {
		planeta.fundarMuseo();
	}

	@Override
	public Integer valor() {
		return super.valor() + 5;
	}
	
	
	
}