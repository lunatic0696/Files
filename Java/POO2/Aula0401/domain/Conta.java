package domain;

public abstract class Conta {
	
	public String titular;
	public double saldo;
	protected int numero;
	
	public int getNumero() {
		return numero;
	}

	public Conta() {
		super();
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

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

	public double getSaldo() {
		return this.saldo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + numero;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Conta other = (Conta) obj;
		if (numero != other.numero)
			return false;
		return true;
	}
	

}
