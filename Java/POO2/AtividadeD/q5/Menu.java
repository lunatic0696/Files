package q5;

import javax.swing.JOptionPane;

public class Menu {
	
	public static String msg = "Selecione uma opção: \n1 - Entrada\n2 - Saída\n3 - Listar situação atual\n4 - Sair";
	public static Parklot p;
	
	public static void showMenu(){
		int opcao = 0;
		opcao = Integer.parseInt(JOptionPane.showInputDialog(msg));
		switch (opcao) {
		case 1:
			String placa = JOptionPane.showInputDialog("Insira a placa do carro: ");
			Veiculo v = new Veiculo(placa);
			int vaga = p.getVagaLivre();
			inserirCarro(p, vaga, v);
			showMenu();
			break;
		case 2:
			String input = JOptionPane.showInputDialog("Insira o número da vaga desejada: ");
			if(!input.isEmpty()) {removerCarro(p, Integer.valueOf(input));}
			else {
				JOptionPane.showMessageDialog(null, "Valor inválido");
			}
			showMenu();
			break;
		case 3:
			showEstacionamento(p);
			showMenu();
			break;
		case 4:
			return;
		default:
			JOptionPane.showMessageDialog(null, "Opção inválida");
			showMenu();
			break;
		}	
		
	}

	public static void inserirCarro(Parklot p,int vaga, Veiculo v) {
		for (int i = 0; i < p.getVagaLivre() ; i++) {
			if (p.park[i].placa == v.placa) {
				JOptionPane.showMessageDialog(null, "Erro: Mesma placa");
				return;
			}
		}
		p.park[vaga] = v;
	}
	
	
	public static void removerCarro(Parklot p, int vaga){
		if (vaga < p.park.length) {
			p.park[vaga] = null;
		}
	}
	
	public static void showEstacionamento(Parklot p){
		String park = "";
		for (int i = 0; i < p.park.length; i++) {
			if (p.park[i] != null) {
				park += i + " - " + p.park[i] + "\n";
			}
		}
		JOptionPane.showMessageDialog(null, park);
	}
	public static void setParklot(Parklot p){
		Menu.p = p;
	}


}
