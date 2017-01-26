package q1;

public class Q1b {
	public static void main(String[] args) {
		int sum = 0;
		int number = 1;
		sum += number;
		number++;
		if (sum<=1000000) {
			sum += number;
			number++;
		}
	}

}
