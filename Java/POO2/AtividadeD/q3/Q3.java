package q3;

import java.util.Random;

public class Q3 {
	
	public static void main(String[] args) {
		
		int[][] image = new int[40][40];
		Random rand = new Random();
		for (int i = 0; i < 40; i++) {
			for (int j = 0; j < 40; j++) {
				image[i][j] = rand.nextInt(256);
				System.out.print(image[i][j] + " ");
			}
			System.out.println();	
		}
		
	}

}