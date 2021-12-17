package trilha.back.financys.service.exceptions;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;
import trilha.back.financys.model.Lancamento;

@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "Parametros com valores errados")
public class LancamentoNotFound extends RuntimeException{
    public LancamentoNotFound(String msg){
        super(msg);
    }
}
