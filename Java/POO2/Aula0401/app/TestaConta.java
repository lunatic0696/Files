package app;

import domain.Conta;

public class TestaConta {

	public static void main(String[] args) {
		
		Conta conta = new Conta("Nome");
		conta.titular = "Paulo";
		conta.saldo = 100000;
		
		System.out.println(conta.toString());

	}

}