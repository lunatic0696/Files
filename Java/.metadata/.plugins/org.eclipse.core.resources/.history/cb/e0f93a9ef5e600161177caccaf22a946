package modelo;

public class Banco {
	
	Conta[] contas = new Conta[100];
	int indexcounter = 0;
	
	public void adiciona(Conta c){
		contas[indexcounter] = c;
		indexcounter++;
	}
	
	public Conta pegaConta(int x){
		return this.contas[x];
	}
	
	public int pegaTotalDeContas(){
		int count = 0;
		for (int i = 0; count < contas.length; i++) {
			if(contas[i] != null){
				count++;
			}
		}
		return count;
	}

}
