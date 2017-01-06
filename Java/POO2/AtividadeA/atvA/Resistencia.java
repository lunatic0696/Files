package atvA;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class Resistencia {
	public static void main(String[] args) {
		
		float[]  res = new float[4];
		res[0] = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor do resistor 1"));
		res[1] = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor do resistor 2"));
		res[2] = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor do resistor 3"));
		res[3] = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor do resistor 4"));
		float maxres = res[0] + res[1] + res[2] + res[3];
		Arrays.sort(res);
		JOptionPane.showMessageDialog(null, "Máxima resistência: " + maxres + "\nMaior resistência"
				+ res[3] + "\nMenor resistência" + res[0]);
		
	}

}
