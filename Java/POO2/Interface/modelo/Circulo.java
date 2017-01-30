package modelo;

import interfaces.AreaCalculavel;

public class Circulo implements AreaCalculavel{
	
	private double raio;

	public Circulo(double raio) {
		super();
		this.raio = raio;
	}

	@Override
	public double calculaArea() {
		return Math.PI * raio * raio;
	}

}
