package banco;

class Conta {
	int numero;
	String nome;
	double saldo;
	double limite;
	
	boolean sacar(double valor){
		if(this.saldo < valor){
			return false;
		}
		else{
		this.saldo -= valor;
		return true;
		}
	}
	void depositar(double valor){
		this.saldo += valor; 
	}
	boolean transfere(Conta destino, double valor){
		boolean retirou = this.sacar(valor);
		if(retirou == true){
			destino.saldo = destino.saldo + valor;
			return true;
		}
		else {
			return false;
		}
	}
}
