package atvA;

import javax.swing.JOptionPane;

public class Login {
	
	public static void menu(int erro){
		
		String msg1 = "Insira seu usuário";
		String msg2 = "Insira sua senha";
		String user = String.valueOf(JOptionPane.showInputDialog(msg1));
		String senha = String.valueOf(JOptionPane.showInputDialog(msg2));
		String msg3 = "Usuário/Senha incorretos!";
		String msg4 = "\nVocê tem ";
		String msg5 = " tentativas.";
		String msg6 = "Login efetuado com sucesso!";
		if(user == "Java8" && senha == "Java8"){
			JOptionPane.showMessageDialog(null, msg6);
		}
		else{
			JOptionPane.showMessageDialog(null, msg3 + msg4 + erro + msg5);
			erro--;
		}
		
		
	}
	public static void main(String[] args) {
		int erro = 3;
		while(erro>0){
			menu(erro);}
	}

}
