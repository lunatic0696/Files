import java.util.Scanner;

public class ap1q1 {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int litros = scanner.nextInt();
		scanner.nextLine();
		int km = scanner.nextInt();
		scanner.nextLine();
		float kml = (km/litros);
		System.out.format("%.2f km/l", kml);
	}
}