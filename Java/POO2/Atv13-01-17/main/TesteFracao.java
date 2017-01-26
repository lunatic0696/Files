package main;
import javax.swing.JOptionPane;

import q2.IOTools;
import q5.Fracao;

public class TesteFracao {

	public static void main(String[] args) {
		int n1 = IOTools.getInt("Insira o numerador da primeira fra��o: ");
		int d1 = IOTools.getInt("Insira o denominador da primeira fra��o: ");
		int n2 = IOTools.getInt("Insira o numerador da segunda fra��o: ");
		int d2 = IOTools.getInt("Insira o denominador da segunda fra��o: ");
		System.out.println(String.format("%d - %d - %d - %d", n1, d1, n2, d2));
		Fracao f1 = new Fracao(n1,d1);
		Fracao f2 = new Fracao(n2,d2);
		System.out.println(f1);
		System.out.println(f2);
		Fracao soma = Fracao.somar(f1, f2);
		Fracao subtracao = Fracao.subtrair(f1, f2);
		double f1dec = Fracao.decimal(f1);
		double f2dec = Fracao.decimal(f2);
		JOptionPane.showMessageDialog(null, "Fra��o 1 - " + f1 + "\nFra��o 2 - " + f2 + 
				"\nSoma - " + soma + "\nSubtra��o" + subtracao + "\nDecimal de F1 - " + f1dec + 
				"\nDecimal de F2 - " + f2dec);

	}

}
