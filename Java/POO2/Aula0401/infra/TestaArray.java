package infra;

import java.util.Arrays;

import domain.Conta;

public class TestaArray {

	public static void main(String[] args) {
		
		Conta[] contas = new Conta[10];
		contas[5] = new Conta();
		contas[5].titular = "Alex";
		contas[5].saldo = -100;
		contas[9] = new Conta();
		
		
		for (int i = 0; i < contas.length; i++) {
			System.out.println(contas[i]);
		}
		

	}

}
