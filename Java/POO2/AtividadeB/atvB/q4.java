package atvB;

import javax.swing.JOptionPane;

public class q4 {
	
	public static int fatorial(int x){
		if (x <= 1){
			return 1;
		}else{
		int f = x * fatorial(x-1);
		return f;}
	}
	
	public static void main(String[] args) {
		int x = Integer.valueOf(JOptionPane.showInputDialog("Digite um n�mero"));
		JOptionPane.showMessageDialog(null, fatorial(x));
		main(args);
	}

}
