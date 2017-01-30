package interfaces;

public interface Conta {

	public void deposita(double valor);

	public void saca(double valor);

	public double getSaldo();

	abstract void atualiza(double taxa);

}
