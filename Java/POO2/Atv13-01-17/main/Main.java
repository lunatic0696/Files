package main;
import java.util.Arrays;
import java.util.Random;

import q2.IOTools;

public class Main {
	
//Questão 3	
//Erro desconhecido acontecendo.

	public static void main(String[] args) {
		int n = IOTools.getInt("Insira um número: ");
		int[] v = new int[n];
		Random rand = new Random();
		for (int i = 0; i < v.length; i++) {
			int randomn = rand.nextInt()*60;
			//Impedir números repetidos
			for (int j = 0; j < v.length; j++) {
				if (Arrays.binarySearch(v, j) == randomn) {
					return;
				}
			}
			v[i] = randomn;
		}
		int count = 0;
		for (int i = 0; i < v.length; i++) {
			if (v[i]%6 == 0) {
				count++;
			}
		IOTools.showMessage(String.valueOf(count));
		}

	}

}
