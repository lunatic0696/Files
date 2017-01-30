package modelo;

import interfaces.ContaTributavel;

public class ContaCorrente implements ContaTributavel{

	private double saldo;

	public void atualiza(double taxa) {
		this.saldo += this.saldo * taxa * 2;
	}

	public void deposita(double valor) {
		this.saldo += valor - 0.10;
	}

	@Override
	public double calculaTributos() {
		return this.getSaldo() * 0.01;
	}

	@Override
	public void saca(double valor) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public double getSaldo() {
		// TODO Auto-generated method stub
		return 0;
	}
}