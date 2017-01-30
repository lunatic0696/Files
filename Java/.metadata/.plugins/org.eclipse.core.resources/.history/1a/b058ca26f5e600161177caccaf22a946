package modelo;

public class AtualizadorDeContas {
	private double saldoTotal = 0;
	private double selic;

	public AtualizadorDeContas(double selic) {
		this.selic = selic;
	}

	public void roda(Conta cont) {
		double saldoant = cont.saldo;
		cont.saldo = cont.saldo - (cont.saldo * selic);
		System.out.println("Saldo anterior: " + saldoant + "\nNovo saldo: " + cont.saldo + "\n");
	}

	public double getSaldoTotal() {
		return saldoTotal;
	}
	
	

}
