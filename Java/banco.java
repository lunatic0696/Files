class Conta{
	int numero;
	String titular;
	String cpf;
	double saldo;
	
	public void sacar(double valor){
		saldo = saldo + valor;
	}
	
		public void deposito(double valor){
		saldo = saldo - valor;
	}
	
	public String toString(){
		return "Conta: " + numero + "Saldo: " + saldo;
	}
}

class TestaConta(){
	public static void main (String[] args){
		Conta conta1 = new Conta();
		conta1.titular = "Rogerio Silva"
		conta1.numero = 123;
		conta1.saldo = 300;
		
		Conta conta1 = new Conta();
		conta1.titular = "Valeria Costa"
		conta1.numero = 124;
		conta1.saldo = 15000;
		
		conta2.sacar(2000);
	}
}