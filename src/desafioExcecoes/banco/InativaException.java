package desafioExcecoes.banco;

public class InativaException extends RuntimeException{
    public InativaException(String mensagem){
        super(mensagem);
    }
}
