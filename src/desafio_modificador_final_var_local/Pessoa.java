package desafio_modificador_final_var_local;

public class Pessoa {
    String nome;

    String informar(String nome,final int IDADE ){
        final int novaIdade = IDADE + 2;
        return "Nome: " + nome + " Idade: " + novaIdade;
    }
}