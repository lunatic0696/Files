package programa1;

public class Pessoa {
	String nome;
	int idade;
	
	public void aniversario(){
		this.idade = this.idade + 1;
	}
	
	public static void main(String[] args) {
		Pessoa fulano = new Pessoa();
		fulano.nome = "Fulano";
		fulano.idade = 26;
		System.out.println(fulano.nome + " - " + fulano.idade + " anos");
		fulano.aniversario();
		fulano.aniversario();
		fulano.aniversario();
		fulano.aniversario();
		fulano.aniversario();
		fulano.aniversario();
		fulano.aniversario();
		fulano.aniversario();
		fulano.aniversario();
		System.out.println(fulano.nome + " - " + fulano.idade + " anos");
	}

}
