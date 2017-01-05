package programa2e3;

public class Casa {
	
	String cor;
	Porta porta1;
	Porta porta2;
	Porta porta3;
	
	void pinta(String cor){
		this.cor = cor;
	}
	
	int nportas(){
		int abertas = 0;
		if (porta1.aberta == true) {
			abertas++;
		}
		if (porta2.aberta == true) {
			abertas++;
		}
		if (porta3.aberta == true) {
			abertas++;
		}
		return abertas;
	}

}
