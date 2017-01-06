package atvA;

import javax.swing.JOptionPane;

public class Aprovacao {
	public static void main(String[] args) {
		float nota1 = Float.parseFloat(JOptionPane.showInputDialog("Insira a primeira nota: "));
		float nota2 = Float.parseFloat(JOptionPane.showInputDialog("Insira a segunda nota: "));
		float ntrab = Float.parseFloat(JOptionPane.showInputDialog("Insira a nota do trabalho: "));
		float media = (nota1+nota2+ntrab)/3;
		if(media >= 6){
			JOptionPane.showMessageDialog(null, "Você foi aprovado.\nMédia: " + media);
		}
		if(media < 6){
			JOptionPane.showMessageDialog(null, "Você não foi aprovado.\nMédia: " + media);
		}
	}

}
