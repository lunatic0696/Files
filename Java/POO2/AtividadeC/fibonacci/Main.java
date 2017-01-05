package fibonacci;

import javax.swing.JOptionPane;

public class Main {
	
	public static void main(String[] args) {
		Fibonacci fib = new Fibonacci();
		int pos = Integer.parseInt(JOptionPane.showInputDialog("Insira a posição em fibonacci:"));
		JOptionPane.showMessageDialog(null, fib.fibonacci(pos));
	}

}
