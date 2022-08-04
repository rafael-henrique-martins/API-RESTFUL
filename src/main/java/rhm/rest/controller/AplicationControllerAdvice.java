package rhm.rest.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import rhm.domain.exception.RegraNegocioException;
import rhm.rest.controller.rest.ApiErrors;

// Classe para tratamento de dados quando uma exception é lanchada
@RestControllerAdvice  // elimina o usso do @ResponseBody
public class AplicationControllerAdvice {
    // Toda vez que meu codigo lanchar uma RegraNegocioException, cai dentro do @ExceptionHandler
    // passa para a variavel, ai eu posso pegar essa mensagem
    @ExceptionHandler(RegraNegocioException.class) // Metodo para tratar erros
    @ResponseStatus(HttpStatus.BAD_REQUEST)  // erros nos dados que o cliente mandou
    public ApiErrors handleRegraNegocioException(RegraNegocioException ex) {
        String mensagemErro = ex.getMessage();
        return new ApiErrors(mensagemErro);
    }
}
