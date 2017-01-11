package atvB;

public class q8 {
	
	public static void q8(int x){
		while(x <= 10){
			System.out.println("\n" + x);
			int y = x;
			while(y>=1){
				System.out.println(" " + (x*y));
				y--;
			}
		x++;
		}
	}

	public static void main(String[] args) {
		q8(1);
		
	}

}
