package modelo;

import interfaces.AreaCalculavel;

public class Retangulo implements AreaCalculavel {
	
	private int altura,largura;

	public Retangulo(int altura, int largura) {
		super();
		this.altura = altura;
		this.largura = largura;
	}

	public double calculaArea() {
		return this.largura * this.altura;
	}

}
