package application;

import javax.swing.JOptionPane;

public class Hello {
	public static void main(String[] args) {
		String nome = JOptionPane.showInputDialog("Nome: ");
		//System.out.println("Hello world!: " + nome);
		JOptionPane.showMessageDialog(null, "Ol� " + nome);
	}

}
