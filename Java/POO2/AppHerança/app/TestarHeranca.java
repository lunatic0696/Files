package app;

import modelo.AlunoEnsinoFundamental;
import modelo.AlunoEnsinoMedio;

public class TestarHeranca {

	public static void main(String[] args) {
		
		AlunoEnsinoFundamental af = new AlunoEnsinoFundamental("Fabio", 123);
		
		af.getNotas()[0] = 10;
		af.getNotas()[1] = 7;
		af.getNotas()[2] = 3;
		
		AlunoEnsinoMedio am = new AlunoEnsinoMedio("Joao Neto", 456);
		
		am.getNotas()[0] = 10;
		am.getNotas()[1] = 7;
		am.getNotas()[2] = 3;
		
		System.out.println(af);
		System.out.println(am);

	}

}
