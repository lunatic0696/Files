package atvA;

import javax.swing.JOptionPane;

public class MenuExercicios {
	
	public static void main(String[] args) {
		int opcao = Integer.parseInt(JOptionPane.showInputDialog("Insira o número do exercício que deseja executar (1,2,3,4):"));
		switch (opcao) {
		case 1:
			DescontoProduto2.main(args);
			break;
		case 2:
			Resistencia.main(args);
			break;
		case 3:
			Login.main(args);
			break;
		case 4:
			Tabuada.main(args);
			break;


		default:
			break;
		}
	}
	
}
