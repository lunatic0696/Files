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
	
	public void deposita(double valor){
		if (valor < 0) {
			throw new ValorInvalidoException(valor);
		} else {
			this.saldo += valor;
		}
	}

}
