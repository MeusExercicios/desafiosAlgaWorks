package desafioOptional;

import java.util.Objects;
import java.util.Optional;

public class Principal {

    public static void main(String[] args) {
        var endereco1 = new Endereco("Av Rondon Pacheco", "2000", "Santa Maria");
        var endereco2 = new Endereco("Av Afonso Pena", "3000", "Centro", new Cidade("Uberlândia"));
        var endereco3 = new Endereco("Av João Naves", "1000", "Santa Mônica", new Cidade("Uberlândia"));
        endereco3.setResidenciaPropria(true);

        var cliente1 = new Cliente("João da Silva");
        var cliente2 = new Cliente("Sebastião Coelho", endereco1);
        var cliente3 = new Cliente("Manoel Filho", endereco2);
        var cliente4 = new Cliente("Maria da Silva", endereco3);

//        System.out.println(obterNomeCidadeResidenciaPropria(cliente1));
//        System.out.println(obterNomeCidadeResidenciaPropria(cliente2));
//        System.out.println(obterNomeCidadeResidenciaPropria(cliente3));
        System.out.println(obterNomeCidadeResidenciaPropria(cliente4));
    }

    private static String obterNomeCidadeResidenciaPropria(Cliente cliente) {
        Objects.requireNonNull(cliente, "Cliente não pode ser nulo");

        return cliente.getEndereco() // Optional<Endereco>
                .filter(Endereco::isResidenciaPropria) // só segue se for residência própria
                .map(Endereco::getCidade)              // transforma em Optional<Cidade>
                .map(Cidade::nome)                     // transforma em Optional<String> com o nome
                .orElseThrow(() ->
                        new TipoDeResidenciaInvalidaException("Cliente sem residência própria ou cidade indefinida"));
    }

}
