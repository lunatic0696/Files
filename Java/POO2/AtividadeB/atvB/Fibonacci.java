package atvB;

import javax.swing.JOptionPane;

public class Fibonacci {
	
	public static int fib(int x){
		if (x <= 1){
			return 1;
		}else{
		int f = fib(x-1) + fib(x-2);
		return f;}
	}
	
	public static void main(String[] args) {
		int x = Integer.valueOf(JOptionPane.showInputDialog("Digite um n�mero"));
		JOptionPane.showMessageDialog(null, fib(x));
		main(args);
	}

}
