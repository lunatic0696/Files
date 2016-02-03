import java.util.Scanner;

public class ap1q12alt{	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		float nota1 = scanner.nextFloat();
		float nota2 = scanner.nextFloat();
		float media = 0;
		while(true){
			nota1 = scanner.nextFloat();
			if(nota1 < 0.0 || nota1 > 10.1){
				System.out.println("nota invalida");
				nota1 = scanner.nextFloat();
			}
			nota2 = scanner.nextFloat();
			if(nota2 < 0.0 || nota2 > 10.1){
				System.out.println("nota invalida");
				nota2 = scanner.nextFloat();
			}else{
				break;
			}
		}
		if((nota1 < 10 && nota1 > 0) && (nota2 < 10 && nota2 > 0));{
			media = (float)((nota1+nota2)/2);
			System.out.format("Media - %.2f", media);
		}
	}
}