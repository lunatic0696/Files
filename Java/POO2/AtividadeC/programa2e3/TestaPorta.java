package programa2e3;

public class TestaPorta {
	
	public static void main(String[] args) {
		Porta porta = new Porta();
		porta.cor = "Branca";
		System.out.println(porta.cor);
		porta.pintar("Prata");
		System.out.println(porta.cor);
		porta.fecha();
		porta.checar();
		porta.abre();
		porta.checar();
	}

}
