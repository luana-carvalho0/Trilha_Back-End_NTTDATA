package trilha.back.financys.service.exceptions;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class CustomizeExceptionHandler {

    @ExceptionHandler(Exception.class)
    public final ResponseEntity<Object> handleAllExceptions(Exception ex, WebRequest request){

        CalculoException calculoException =
                new CalculoException(ex.getMessage());

        return new ResponseEntity<>(calculoException.getMensagemException(), HttpStatus.INTERNAL_SERVER_ERROR);

    }
}
