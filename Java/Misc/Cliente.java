package br.edu.ifpi.banco.modelo;

public class Cliente {
	
	private String nome;
	private String cpf;
	private String cidade;
	
	public Cliente(String titular, String cpf) {
		this.nome = titular;
		this.cpf = cpf;
	}
	
	@Override
	public String toString() {
		return " Cliente: "+this.nome;
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setTitular(String titular) {
		this.nome = titular;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

}
