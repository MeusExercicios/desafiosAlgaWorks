package desafio_composicao_metodo;

public class Funcionario {
    String nome;
    int quantidade_de_filhos;
    Registro registro;
    Holerite  holerite;

    boolean temFilho(int quantidade_de_filhos) {
        return quantidade_de_filhos > 0;
    }

}
