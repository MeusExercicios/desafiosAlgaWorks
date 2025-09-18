package desafio_composicao_metodo;

public class Funcionario {
    String nome;
    int quantidade_de_filhos;

    String informarFuncionario(String nome, int quantidade_de_filhos) {
        return "Nome: " + nome + "\nQuantida de filhos: " + quantidade_de_filhos;
    }
}
