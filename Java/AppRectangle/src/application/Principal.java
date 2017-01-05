package application;

import javax.swing.JOptionPane;

import domain.Point;
import domain.Rectangle;

public class Principal {

	public static void main(String[] args) {
		String menu = "#### RT ####";
		menu += "\n 1 - Configurar Rect1";
		menu += "\n 2 - Configurar Rect2";
		menu += "\n 3 - Area de Rect1";
		menu += "\n 4 - Verfificar se Rect2 está em Rect1";
		menu += "\n\n 0 - Sair";
		
		Rectangle rect1 = new Rectangle();
		Rectangle rect2 = new Rectangle();
		Point point1 = new Point();
		Point point2 = new Point();

		int op = -1;

		while (op != 0) {
			op = getInt(menu);

			switch (op) {
			case 1:
				// Config Rect1
				rect1.height = getDouble("Height: ");
				rect1.width = getDouble("Width: ");
				rect1.origem.x = getDouble("Ponto X: ");
				rect1.origem.y = getDouble("Ponto Y: ");
				break;
			case 2:
				// Config Rect2
				rect2.height = getDouble("Height: ");
				rect2.width = getDouble("Width: ");
				rect2.origem.x = getDouble("Ponto X: ");
				rect2.origem.y = getDouble("Ponto Y: ");
				break;
			case 3:
				getString("Area do Rect1: " + rect1.area());
				break;
			case 4:
				getString("Perimetro do Rect1: " + rect1.perimeter());
				break;
			default:
				JOptionPane.showMessageDialog(null, "Mensagem inválida");;
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
