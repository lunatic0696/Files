package q4;

/*Sum é calculado 100 vezes até que i seja 0, diminuindo seu 
aumento conforme se aproxima do final.*/

public class B {
	
	public static void main(String[] args) {
		int sum = 0, i = 100;
		while(i != 0){
			sum += i;
			i--;
			System.out.println("sum = " + sum);
			System.out.println("i = " + i);
		}
	
	}

}
