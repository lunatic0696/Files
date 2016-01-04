import java.util.Scanner;

public class ap1q8 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int idade;
		int soma;
		int total;
		idade = scanner.nextInt();
		total = 0;
		soma = 0;
		while(idade > 0){
			soma += idade;
			idade = scanner.nextInt();
			total++;
			if(idade < 0){
				float x = (float)(total);
				float media = soma/x;
				System.out.format("%.2f", media);
			}
		}
	}
}