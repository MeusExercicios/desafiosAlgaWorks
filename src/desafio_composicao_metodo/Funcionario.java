package desafio_composicao_metodo;

public class Funcionario {
    String nome;
    int quantidade_de_filhos;

    boolean temFilho(int quantidade_de_filhos){
        return quantidade_de_filhos > 0;
    }

    String informarFuncionario(String nome, int quantidade_de_filhos) {
        return "Nome: " + nome + " \nQuantida de filhos: " + quantidade_de_filhos;
    }
}
