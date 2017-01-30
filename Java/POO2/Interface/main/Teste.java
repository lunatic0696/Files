package main;

import interfaces.AreaCalculavel;
import modelo.Retangulo;

public class Teste {

	public static void main(String[] args) {
		AreaCalculavel a = new Retangulo(3, 2);
		System.out.println(a.calculaArea());

	}

}
