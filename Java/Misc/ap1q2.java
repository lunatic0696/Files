import java.util.Scanner;

public class ap1q2 {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		String nome = scanner.nextLine();
		float salario = scanner.nextFloat();
		scanner.nextLine();
		float vendas = scanner.nextFloat();
		scanner.nextLine();
		float total = (float) ((vendas*0.15)+salario);
		System.out.format("Total = R$ %.2f", total);
	}
}