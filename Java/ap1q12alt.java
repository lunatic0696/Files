import java.util.Scanner;

public class ap1q12{	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		float nota1 = scanner.nextDouble();
		float nota2 = scanner.nextDouble();
		float media = 0;
		 while(true){
	nota1 = input.nextFloat();
	if(nota1 < 0.0 || nota1 > 10.1){
		System.out.println("nota invalida");
		nota1 = input.nextFloat();
	}
	nota2 = input.nextFloat();
	if(nota2 < 0.0 || nota2 > 10.1){
		System.out.println("nota invalida");
		nota2 = input.nextFloat();
	}else{
		break;
	}
		}
		else if(nota1 < 10 && nota1 > 0) && (nota2 < 10 && nota2 > 0){
			media = (double)((nota1+nota2)/2);
			System.out.format("Media - %.2f", media);
		}
	}
}