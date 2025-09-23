package desafio_modificador_final_var_local;

public class Principal {
    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa();
        pessoa.nome = "vitor";
        final int IDADE = 18;

        System.out.println(pessoa.informar(pessoa.nome, IDADE));

    }
}