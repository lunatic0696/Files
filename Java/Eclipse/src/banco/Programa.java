package banco;

class Programa{
	public static void main(String[] args) {
		Conta minhaConta;
		minhaConta = new Conta();
		minhaConta.nome = "Paulo";
		minhaConta.saldo = 1000.00;
		System.out.println("Saldo atual: " + minhaConta.saldo);
		Conta outraConta;
		outraConta = new Conta();
		outraConta.nome = "Fulano";
		outraConta.saldo = 3000;
		minhaConta.transfere(outraConta, 100);
		System.out.println(outraConta.saldo);
		System.out.println(minhaConta.saldo);
	}
}