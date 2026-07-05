package api_mensagem.api.infrastructure.exception;

import javax.naming.AuthenticationException;

public abstract class UnauthorizedException extends AuthenticationException{

    public UnauthorizedException(String mensagem){
        super(mensagem);
    }

    public UnauthorizedException(String mensagem, Throwable throwable){
        super(mensagem);
    }
}
