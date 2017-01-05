package q4;

public class q4 {
	
	public static void main(String[] args) {
		
		int[] pares = new int[10];
		int[] impares = new int[10];
		int countpar = 0;
		int countimpar = 0;
		
		for (int i = 1; i < 20 ; i++) {
			
			if (i % 2 == 1) {
				impares[countimpar] = i;
				countimpar++;
			}
			else if(i % 2 == 0){
				pares[countpar] = i;
				countpar++;
			}
		}
		for (int r = 0; r < impares.length; r++) {
			System.out.print(impares[r] + " ");
		}
		System.out.println();
		for (int r = 0; r < pares.length; r++) {
			System.out.print(pares[r] + " ");
		}
	}

}
