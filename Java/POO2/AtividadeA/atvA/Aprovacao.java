package atvA;

import javax.swing.JOptionPane;

public class Aprovacao {
	public static void main(String[] args) {
		float nota1 = Float.parseFloat(JOptionPane.showInputDialog("Insira a primeira nota: "));
		float nota2 = Float.parseFloat(JOptionPane.showInputDialog("Insira a segunda nota: "));
		float ntrab = Float.parseFloat(JOptionPane.showInputDialog("Insira a nota do trabalho: "));
		float media = (nota1+nota2+ntrab)/3;
		if(media >= 6){
			JOptionPane.showMessageDialog(null, "Voc� foi aprovado.\nM�dia: " + media);
		}
		if(media < 6){
			JOptionPane.showMessageDialog(null, "Voc� n�o foi aprovado.\nM�dia: " + media);
		}
	}

}
