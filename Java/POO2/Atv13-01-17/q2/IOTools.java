package q2;

import javax.swing.JOptionPane;

public class IOTools {
	
	public static String getString(String msg){
		//System.out.println(msg);
		//DataInputStream dado;
		//dado = new DataInputStream(System.in);
		String dado = JOptionPane.showInputDialog(msg);
		try{
			//@SuppressWarnings("deprecation")
			String input = dado;
			return input;			
		}
		catch(Exception erro){
			System.out.println("Erro na entrada de dados");
			return getString(msg);
		}

		
	}
	
	public static int getInt(String msg){
		//System.out.println(msg);
		//DataInputStream dado;
		int dado = Integer.valueOf(JOptionPane.showInputDialog(msg));
		//dado = new DataInputStream(System.in);
		try{
			int input = dado;
			return input;
		}
		catch(Exception erro){
			System.out.println("Erro na entrada de dados");
			return getInt(msg);
		}
	}
	
	public static double getReal(String msg){
		//System.out.println(msg);
		//DataInputStream dado;
		//dado = new DataInputStream(System.in);
		double dado = Double.valueOf(JOptionPane.showInputDialog(msg));
		try{
			double input = dado;
			return input;
		}
		catch(Exception erro){
			System.out.println("Erro na entrada de dados");
			return getInt(msg);
		}
	}
	
	public static void showMessage(String msg){
		System.out.println(msg);
	}

}
