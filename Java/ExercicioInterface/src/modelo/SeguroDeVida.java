package modelo;

import interfaces.Tributavel;

public class SeguroDeVida implements Tributavel {
	
	@Override
	public double calculaTributos() {
		return 42;
	}

}
