package modelo;

public class AlunoEnsinoFundamental extends Aluno{
	
	private boolean podeSairSo;

	public AlunoEnsinoFundamental(String nome) {
		this(nome, -1);

	}
	
	public AlunoEnsinoFundamental(String n, int mat) {
		super(n, mat);
		this.podeSairSo = false;

	}
	
}
