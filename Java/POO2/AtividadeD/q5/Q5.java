package q5;

import java.util.Arrays;

public class Q5 {
	
	
	public static void main(String[] args) {
		
		Parklot p = new Parklot();
		Arrays.fill(p.park, "Vazio");
		Menu.setParklot(p);
		Menu.showMenu();
		
		
	}

}
