package trilha.back.financys.exceptions;

public class CalculoException extends RuntimeException{

    String mensagemException;

    public CalculoException(String mensagemException){
        super(mensagemException);
    }

    public CalculoException(String message, String mensagemException) {
        super(message);
        this.mensagemException = mensagemException;
    }

    public String getMensagemException() {
        return mensagemException;
    }
}
