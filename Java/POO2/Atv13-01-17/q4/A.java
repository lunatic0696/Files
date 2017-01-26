package q4;

//Ele fica num loop infinito gerando núneros cada vez maiores.

public class A {
	public static void main(String[] args) {
		int sum = 0, i = 0;
		while(i>=0){
			sum += i;
			i++;
			System.out.println("sum = " + sum);
			System.out.println("i = " + i);
		}
	}

}
