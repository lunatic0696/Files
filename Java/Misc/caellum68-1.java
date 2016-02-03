class Data {
	int dia;
	int mes;
	int ano;
	public Data(int dia,int mes,int ano){
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	public String toString(){
		return dia + "/" + mes + "/" + ano;
		}
}

class PessoaFisica {
	private String nome;
	private double cpf ;
	public PessoaFisica(String nome, double cpf) {
		this.nome = nome;
		if(cpf > 100000000 && cpf < 999999999){
			this.cpf = cpf;}
		else{
		System.out.println("Cpf invalido");
		}
	}
}

class Funcionario {
	private double salario;
	private String nome;
	static int id = 0;
	public double getSalario(){
		return this.salario;
	}
	public void setSalario(double salario){
		this.salario = salario;
	}
	public String getNome(){
		return this.nome;
	}
	public void setNome(String nome){
		this.nome = nome;
	}
	public int getId(){
		return this.id;
	}
	public Funcionario() {
		id += 1;
	}
	public Funcionario(String nome){
		this.nome = nome;
		id += 1;
	}
	public Funcionario(String nome, double salario){
		this.nome = nome;
		this.salario = salario;
		id += 1;
	}
}