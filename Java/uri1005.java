import java.util.Scanner;

public class uri1005 {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int valor1 = scanner.nextInt();
		scanner.nextLine();
		int valor2 = scanner.nextInt();
		scanner.nextLine();
		int media = (valor1+valor2)/2;
		System.out.format("Media = %d", media);
	}
}