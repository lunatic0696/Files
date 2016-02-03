package forca;
import java.util.Scanner;

public class forca{
	void menu(){
		System.out.println("Bem vindo ao jogo da forca!\n1 - Jogar\n2 - Ranking\n3 - Adcionar uma palavra\n4 - Adicionar Tema\n0 - Sair");
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Tema Animais = new Tema();
		Animais.addpalavra("Gato");
		input.nextLine();
	
	
	}
}

