package atvB;

import javax.swing.JOptionPane;

public class q5 {
	
	public static long fatorial(long x){
		if (x <= 1){
			return 1;
		}else{
		long f = x * fatorial(x-1);
		return f;}
	}
	
	public static void main(String[] args) {
		long x = 0;
		while (x <= 40) {
			JOptionPane.showMessageDialog(null, fatorial(x));
			x++;
		}
	}

}
