import java.util.Scanner;

public class ap1q11 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int input;
		int a, g, d;
		a = 0;
		g = 0;
		d = 0;
		input = scanner.nextInt();
		while(input != 4){
			if(input == 1){
				a++;
				input = scanner.nextInt();
			}
			else if (input == 2){
				g++;
				input = scanner.nextInt();
			}
			else if (input == 3){
				d++;
				input = scanner.nextInt();
			}
			else{
				input = scanner.nextInt();
			}		
		}
		System.out.format("MUITO OBRIGADO \n Alcool: %d \n Gasolina: %d \n Diesel: %d", a, g, d);
		
	}	
}