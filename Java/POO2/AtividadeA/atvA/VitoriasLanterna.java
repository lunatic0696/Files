package atvA;

import java.util.Scanner;

public class VitoriasLanterna {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner scan;
		scan = new Scanner(System.in);
		System.out.println("Insira o número de pontos do time líder");
		int lider = scan.nextInt();
		System.out.println("Insira o número de pontos do time lanterna");
		int lant = scan.nextInt();
		int dif = lider - lant;
		int vict = dif/3;
		if(dif%3 != 0){
			vict++;
		}
		System.out.println("O número de vitórias necessárias é: " + vict);
		
	}

}
