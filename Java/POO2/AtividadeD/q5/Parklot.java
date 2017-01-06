package q5;

import java.util.Arrays;

public class Parklot {
	
	public Veiculo[] park = new Veiculo[10];
	
	public int getVagaLivre(){
		int n = 0;
		while(n < 10){
			if(this.park[n] == null){
				return n;
			}
			else{
				n++;
			}
		}
		return n;
	}

}
