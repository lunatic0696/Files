package Testes;
import javax.swing.JOptionPane;

public class TesteJOptionPane{
		public static void main(String[] args) {
		
		String menu = "###### Forca ######\n";
			menu += "1 - Nova Palavra\n"
					+"2 - Nova Rodada\n"
					+"3 - Ranking\n"
					+"-----------------\n"
					+"0 - Sair";
		while(true){
			int op = Integer.parseInt(JOptionPane.showInputDialog(menu));
			switch(op){
				case 1:
					novaPalavra();
					msg("Nova Palavra");
					break;
				case 2:
					novaRodada();
					msg("Nova Rodada");
					break;
				case 3:
					ranking();
					msg("Ranking");
					break;
				default:
					msg("Opcao invalida");
					
			}
		}
	}
	
	private static void ranking() {
		}

	private static void novaRodada() {	
		}

	private static void novaPalavra() {	
		}

	private static void msg(String str) {
		JOptionPane.showMessageDialog(null, str);
	}
}