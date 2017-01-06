package atvA;

import javax.swing.JOptionPane;

public class DescontoProduto {

	public static void main(String[] args) {
		
		float preco = Float.parseFloat(JOptionPane.showInputDialog("Insira o preço do produto: "));
		int desconto = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor do desconto (em porcentagem): "));
		float vfinal = (preco * (desconto/100));
		float dfinal = (preco - vfinal);
		JOptionPane.showMessageDialog(null, "Valor novo do produto: " + vfinal);
		JOptionPane.showMessageDialog(null, "Valor descontado: " + dfinal);

	}

}
