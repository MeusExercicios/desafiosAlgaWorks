package desafioExcecoes.banco;

public class MaiorValorException extends RuntimeException{
    public MaiorValorException(String mensagem){
        super(mensagem);
    }
}
