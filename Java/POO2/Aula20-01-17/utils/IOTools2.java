package utils;

import javax.swing.JOptionPane;

public class IOTools2 {
	
	//Sem exception
	public static String getString(String msg, boolean required){
		String entrada = JOptionPane.showInputDialog(msg);
		if(entrada.isEmpty() && required){
			showError("Cara, é obrigatório");
			getString(msg, required);
		}
		return entrada;
	}
	
	//Com exception
	public static int getInt(String msg, boolean required){
		try {
			int entrada = Integer.valueOf(getString(msg,required));
			return entrada;
		} catch (Exception e) {
			showError("Por favor, digite números inteiros");
			return getInt(msg,required);
		}
	}
	
	public static void showMsg(String msg){
		JOptionPane.showMessageDialog(null, msg, "R1 Corp.",JOptionPane.INFORMATION_MESSAGE);
	}
	
	public static void showError(String msg){
		JOptionPane.showMessageDialog(null, msg, "R1 Corp.",JOptionPane.ERROR_MESSAGE);
	}

}
