package atvB;

public class q6 {
	
	public static int fib(int x){
		if (x <= 1){
			return 1;
		}else{
		int f = fib(x-1) + fib(x-2);
		return f;}
	}
	
	public static void main(String[] args) {
		int x = 0;
		while(x <= 60){
			System.out.println(fib(x));
			x++;
		}
	}

}
