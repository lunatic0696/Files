package application;

import javax.swing.JOptionPane;

import domain.Rectangle;

public class Principal {

	public static void main(String[] args) {
		String menu = "#### RT ####";
		menu += "\n 1 - Configurar Rect1";
		menu += "\n 2 - Configurar Rect2";
		menu += "\n 3 - Area de Rect1";
		menu += "\n 4 - Verfificar se Rect2 est� em Rect1";
		menu += "\n\n 0 - Sair";

		int op = -1;

		while (op != 0) {
			op = getInt(menu);

			switch (op) {
			case 1:
				// Config Rect1
				break;
			case 2:
				// Config Rect2
				break;
			case 3:
				break;
			default:
				JOptionPane.showMessageDialog(null, "Mensagem inv�lida");;
				break;
			}
		}
	}

	private static Double getDouble(String msg) {
		return Double.valueOf(JOptionPane.showInputDialog(msg));
	}

	private static String getString(String msg) {
		return JOptionPane.showInputDialog(msg);
	}

	private static Integer getInt(String msg) {
		return Integer.valueOf(JOptionPane.showInputDialog(msg));
	}

}
