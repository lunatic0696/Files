package atvA;

import javax.swing.JOptionPane;

public class DescontoProduto2 {
	
	public static void main(String[] args) {
		
		String nome = JOptionPane.showInputDialog("Insira o nome do produto");
		float produto = Float.parseFloat(JOptionPane.showInputDialog("Insira o valor do produto"));
		float novo = 0;
		if (produto>=50 && produto<200) {
			novo = (float)(produto-(produto*0.05));
		}
		else if (produto>=200 && produto<500) {
			novo = (float)(produto-(produto*0.06));
		}
		else if (produto>=500 && produto<1000) {
			novo = (float)(produto-(produto*0.07));
		}
		else if (produto>1000) {
			novo = (float)(produto-(produto*0.08));
		}
		else if (produto<0) {
			JOptionPane.showMessageDialog(null, "Valor inv�lido");;
		}
		JOptionPane.showMessageDialog(null, "Nome do produto: " + nome + "\nValor do produto com desconto: " + novo);;
		
	}

}
