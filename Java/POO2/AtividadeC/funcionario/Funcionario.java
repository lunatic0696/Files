package funcionario;

public class Funcionario {
	
	public String nome;
	public double salario;
	public Data dtEntrada;
	public String RG;
	
	public void aumentaSalario(double aumento){
		this.salario += aumento;
	}
	
	public void mostra(){
		System.out.println("Nome: " + this.nome);
		System.out.println("Salario: " + this.salario);
		if (this.dtEntrada != null) {
			System.out.println("Data de entrada:" + this.dtEntrada.toString());
		}
		System.out.println(this.RG);
	}

}
