import java.util.Scanner;

public class uri1001 {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int valor1 = scanner.nextInt();
		scanner.nextLine();
		int valor2 = scanner.nextInt();
		scanner.nextLine();
		int x = valor1 + valor2;
		System.out.format("X = %d", x);
	}
}