import java.util.Scanner;

public class ap1q5 {
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	int senha = 2002;
	while(1==1){
		System.out.println("Insira a senha");
		int input = scanner.nextInt();
		scanner.nextLine();
		if(senha != input){
			System.out.println("Senha Invalida");}
		else if(senha == input){
			System.out.println("Acesso Permitido");}
			break;
		}
	}
}