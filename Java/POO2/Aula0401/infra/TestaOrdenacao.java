package infra;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import domain.ContaPoupanca;

public class TestaOrdenacao {

	public static void main(String[] args) {
		List<ContaPoupanca> contas = new LinkedList<>();
		
		ContaPoupanca c1 = new ContaPoupanca("Fulano");
		c1.setNumero(1973);
		contas.add(c1);
		
		ContaPoupanca c2 = new ContaPoupanca("Cicrano");
		c2.setNumero(1462);
		contas.add(c2);
		
		ContaPoupanca c3 = new ContaPoupanca("Beltrano");
		c3.setNumero(1854);
		contas.add(c3);
		
		Collections.sort(contas);
		
		for (int i = 0; i < contas.size(); i++) {
			System.out.println("numero: " + contas.get(i).getNumero());
			}

	}

}
