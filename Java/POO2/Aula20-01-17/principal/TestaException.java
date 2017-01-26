package principal;

import javax.swing.JOptionPane;

import static utils.IOTools2.*;

public class TestaException {

	public static void main(String[] args) {
		System.out.println("Teste");
		String menu = "1 - Idade\n0 - Sair";
		
		while (true){
			int op = getInt(menu);
			
			switch (op) {
			case 0:
				
				return;

			default:
				break;
			}
		}

	}

}
