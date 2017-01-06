package atvA;

import javax.swing.JOptionPane;

public class Tabuada {
	public static void main(String[] args) {
		
		int n = Integer.parseInt(JOptionPane.showInputDialog("Insira um número"));
		JOptionPane.showMessageDialog(null, n + " x 1 = " + n + "\n"
				+ n + " x 2 = " + 2*n + "\n"
				+ n + " x 3 = " + 3*n + "\n"
				+ n + " x 4 = " + 4*n + "\n"
				+ n + " x 5 = " + 5*n + "\n"
				+ n + " x 6 = " + 6*n + "\n"
				+ n + " x 7 = " + 7*n + "\n"
				+ n + " x 8 = " + 8*n + "\n"
				+ n + " x 9 = " + 9*n + "\n"
				+ n + " x 10 = " + 10*n + "\n");
	
	}

}
