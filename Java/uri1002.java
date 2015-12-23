import java.util.Scanner;

public class uri1002 {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		float raio = scanner.nextInt();
		scanner.nextLine();
		float area = (float)((raio*raio)*3.14159);
		System.out.format("Area = %.2f", area);
		
	}
}