package atvA;

import javax.swing.JOptionPane;

public class Aposentadoria {
	public static void main(String[] args) {
		
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade: "));
		String sexo = JOptionPane.showInputDialog("Digite seu sexo: ");
		int tcont = Integer.parseInt(JOptionPane.showInputDialog("Insira seu tempo de contribuição(em anos): "));
		boolean ap = false;
		if(sexo == "Homem" || sexo == "Masculino" || sexo == "M"){
			if(tcont >= 35 || idade >= 65){
				ap = true;
			}
		}
		if(sexo == "Mulher" || sexo == "Feminino" || sexo == "F"){
			if(tcont >= 30 || idade >= 60){
				ap = true;
			}
		}
		if(ap == true){
			JOptionPane.showMessageDialog(null, "Você já pode se aposentar");
		}
		else if(ap == false){
			JOptionPane.showMessageDialog(null, "Você ainda não pode se aposentar");
		}
		
	}

}
