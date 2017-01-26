package domain;

public class ValorInvalidoException extends RuntimeException {
	
	public ValorInvalidoException(String message) {
		super(message);
	}
	
	public ValorInvalidoException(Double valor) {
		super("Valor inv�lido: " + valor);
	}

}
