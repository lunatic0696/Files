class Aluno{
	String nome;
	int matricula;
	int idade;
	String curso;
	public String toString(){
		return "Aluno: " + nome;
	}
}

class testaluno{
	public static void main(String[] args) {
		System.out.println("Ola¡ 2016");
		Aluno aluno = new Aluno();
		aluno.nome = "Rogerio da Silva";
		System.out.println(aluno);
	}
}