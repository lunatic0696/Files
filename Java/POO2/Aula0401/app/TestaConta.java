package app;

import domain.Banco;
import domain.Conta;

public class TestaConta {

	public static void main(String[] args) {
		
		Banco r1Bank = Banco.getInstance();
		System.out.println(r1Bank);
		
		Conta conta = new Conta("Nome");
		conta.titular = "Paulo";
		conta.saldo = 100000;
		
		Conta conta2 = new Conta("Rog�rio");
		conta.deposita(17500);
		
		Conta conta3 = new Conta("Fulano");
		conta3.deposita(2000);
		
		System.out.println(conta.toString());

	}

}
