import java.util.Scanner;

public class ap1q10 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int input;
		int pares;
		int impares;
		int count;
		input = scanner.nextInt();
		pares = 0;
		impares = 0;
		count = 0;
		while(count != 5){
			if(input%2 == 0){
				pares++;
			}
			else if (input%2 == 1){
				impares++;
			}
			count++;
			input = scanner.nextInt();
		}
		if (count != 5){
		}
		else if(count == 5){
			System.out.format("%d numeros pares", pares);
		}
	}	
}