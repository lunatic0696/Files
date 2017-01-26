package domain;

public class ValorInvalidoException extends RuntimeException {
	
	public ValorInvalidoException(String message) {
		super(message);
	}
	
	public ValorInvalidoException(Double valor) {
		super("Valor inválido: " + valor);
	}

}
