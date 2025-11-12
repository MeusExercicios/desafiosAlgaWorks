package exemplo;

import java.util.Optional;

public class Teste {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa(null, 29);
        Optional<String> nome = Optional.ofNullable(p1.getNome());


        nome.ifPresentOrElse(
                n -> System.out.println("Nome: " + n),
                () -> System.out.println("Valor ausente")
        );
//        System.out.println(nome.orElse("Nome não informado").toUpperCase());
//        Optional<String> nome2 = Optional.ofNullable(p1.getNome());
//
//        nome2.ifPresent(System.out::println);


//        Optional<String> nome3 = Optional.empty();
//        String valor = nome3.orElseThrow(() -> new IllegalArgumentException("Nome obrigatorio"));


//            String nome1 = nome.orElse("Sem nome");
//            String nome2 = nome.orElseGet(()->"Gerado dinamicamente");
//        System.out.println(nome1);
//        System.out.println(nome2);

    }
}
