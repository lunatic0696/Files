package atvB;

import java.util.Scanner;

public class q7 {
	
	private static Scanner s;
	
	public static void q7(int x){
		if(x%2 == 0){
			x = x+2;
		}
		else if(x%2 == 1){
			x = (3 * x) + 1;
		}
		if(x != 1){
			System.out.println(x);
			q7(x);
			}
		else{
			return;
		}
		
	}

	public static void main(String[] args) {
		s = new Scanner(System.in);
		int x = s.nextInt();
		q7(x);
		
		
	}

}
