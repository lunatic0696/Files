package domain;

public abstract class Conta {
	
	public String titular;
	public double saldo;
	
	public Conta(String titular) {
		this.titular = titular;

	}
	
	@Override
	public String toString() {
		return "Conta [Titular: " + titular + " Saldo: "+ saldo + "]";
	}
	
	public void setTitular(String titular) {
		this.titular = titular;
	}
	
	public void depositar(double valor){
		this.saldo += valor;
	}

}
