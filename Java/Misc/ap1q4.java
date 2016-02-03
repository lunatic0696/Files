import java.util.Scanner;

public class ap1q4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int linhas = scanner.nextInt();
		scanner.nextLine();
		int v1 = 1;
		int v2 = 2;
		int v3 = 3;
		int inicio = 0;
		while (linhas != inicio) {
			System.out.format("%d, %d, %d, IFPI \n",v1 ,v2, v3);
			v1+=4;
			v2+=4;
			v3+=4;
			inicio++;
		}
	}
}