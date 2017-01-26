package infra;

import domain.Conta;
import domain.ContaPoupanca;
import domain.ValorInvalidoException;

public class TestaDeposita {

	public static void main(String[] args) {
		Conta cp = new ContaPoupanca("Fulano");
		try {
			cp.deposita(-100);
		} catch (ValorInvalidoException e) {
			System.out.println("Você tentou depositar um valor inválido");
		}

	}

}
