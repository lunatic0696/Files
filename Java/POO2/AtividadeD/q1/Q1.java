package q1;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class Q1 {
	
	public static void main(String[] args) {
		
		double[] notas = new double[5];
		for (int i = 0; i < notas.length; i++) {
			double nota = Double.parseDouble(JOptionPane.showInputDialog("Insira a nota " + (i+1)));
			notas[i] = nota;
		}
		Arrays.sort(notas);
		double media = 0;
		for (int i = 0; i < notas.length; i++) {
			media += notas[i];
		}
		media = media/notas.length;
		JOptionPane.showMessageDialog(null, notas[0] + "\n" + notas[1] + "\n" + notas[2] + "\n" + notas[3] + "\n" + notas[4] + "\n \nMedia:" + media);
	}

}
