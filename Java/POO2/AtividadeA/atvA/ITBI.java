package atvA;

import javax.swing.JOptionPane;

public class ITBI {

	public static void main(String[] args) {
		
		float vtrans = Float.parseFloat(JOptionPane.showInputDialog("Insira o valor da transa��o: "));
		int impo = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor da transa��o: "));
		float vimp = vtrans*(impo/100);
		JOptionPane.showMessageDialog(null, "valor pago de imposto: " + vimp);

	}

}
