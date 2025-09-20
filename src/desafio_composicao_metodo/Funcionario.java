package desafio_composicao_metodo;

public class Funcionario {
    String nome;
    int quantidade_de_filhos;

    boolean temFilho(int quantidade_de_filhos) {
        return quantidade_de_filhos > 0;
    }

}
