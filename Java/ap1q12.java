import java.util.Scanner;

public class ap1q12{	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double nota1 = scanner.nextDouble();
		double nota2 = scanner.nextDouble();
		double media = 0;
		if(nota1 > 10 || nota1 < 0){
			System.out.format("Nota invalida");
			double nota1 = scanner.nextDouble();
		}
		if(nota2 > 10 || nota2 < 0){
			System.out.format("Nota invalida");
			double nota1 = scanner.nextDouble();
		}
		else if(nota1 < 10 && nota1 > 0) && (nota2 < 10 && nota2 > 0){
			media = (double)((nota1+nota2)/2);
			System.out.format("Media - %.2f", media);
		}
	}
}