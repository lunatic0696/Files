package funcionario;

public class Data {
	
	public int dia;
	public int mes;
	public int ano;
	
	public void setDia(int dia) {
		this.dia = dia;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	@Override
	public String toString() {
		return this.dia + "/" + this.mes + "/" + this.ano;
	}

}
