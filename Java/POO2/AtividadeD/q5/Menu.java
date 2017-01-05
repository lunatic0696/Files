package q5;

import javax.swing.JOptionPane;

public class Menu {
	
	public static String msg = "Selecione uma op��o: \n1 - Entrada\n2 - Sa�da\n3 - Listar situa��o atual\n4 - Sair";
	public static Parklot p;
	
	public static void showMenu(){
		
		int opcao = Integer.parseInt(JOptionPane.showInputDialog(msg));
		switch (opcao) {
		case 1:
			String placa = JOptionPane.showInputDialog("Insira a placa do carro: ");
			int vaga = Integer.parseInt(JOptionPane.showInputDialog("Insira o n�mero da vaga desejada: "));
			inserirCarro(p, vaga, placa);
			showMenu();
		case 2:
			int vagarem = Integer.parseInt(JOptionPane.showInputDialog("Insira o n�mero da vaga desejada: "));
			removerCarro(p, vagarem);
			showMenu();
		case 3:
			showEstacionamento(p);
			showMenu();
		case 4:
			break;
		
		default:
			JOptionPane.showMessageDialog(null, "Op��o inv�lida");
			showMenu();
		}	
		
	}

	public static void inserirCarro(Parklot p,int vaga, String placa) {
		if (vaga < p.park.length) {
			p.park[vaga] = placa;
		}
	}
	
	public static void removerCarro(Parklot p, int vaga){
		if (vaga < p.park.length) {
			p.park[vaga] = "Vazio";
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