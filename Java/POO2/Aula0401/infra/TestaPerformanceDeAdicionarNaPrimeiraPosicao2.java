package infra;

import java.util.ArrayList;
import java.util.List;

public class TestaPerformanceDeAdicionarNaPrimeiraPosicao2 {

	public static void main(String[] args) {
		System.out.println("Iniciando...");
		long inicio = System.currentTimeMillis();
		List<Integer> teste = new ArrayList<>();
		for (int i = 0; i < 30000; i++) {
		teste.add(0, i);
		}
		long fim = System.currentTimeMillis();
		double tempo = (fim - inicio) / 1000.0;
		System.out.println("Tempo gasto: " + tempo);

	}

}
