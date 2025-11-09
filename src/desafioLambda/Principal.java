package desafioLambda;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.function.Predicate;

public class Principal {

    public static void main(String[] args) {
        var funcionarios = new ArrayList<Funcionario>();
        funcionarios.add(new Funcionario("João", new BigDecimal("19000"), true));
        funcionarios.add(new Funcionario("Maria", new BigDecimal("5000"), true));
        funcionarios.add(new Funcionario("Manoel", new BigDecimal("13000"), true));
        funcionarios.add(new Funcionario("Sebastião", new BigDecimal("12000"), false));

        // TODO remover funcionários inativos
        //Predicate<Funcionario> trabalhadores = n -> n.isInativo(); FAZENDO COM LAMBDA
        Predicate<Funcionario> trabalhadores = Funcionario :: isInativo;
        funcionarios.removeIf(trabalhadores);


        // TODO ordenar funcionários pelo valor do salário
        //Comparator<Funcionario> trabalhadoresComparator = (p1,p2) ->p1.getSalario().compareTo(p2.getSalario());
        //Comparator<Funcionario> trabalhadoresComparator = Comparator.comparing(Funcionario::getSalario);
        //funcionarios.sort(trabalhadoresComparator);
        funcionarios.sort(Comparator.comparing(Funcionario::getSalario));



        // TODO iterar e imprimir funcionários usando o método estático imprimir
        funcionarios.forEach(Principal::imprimir);


    }

    private static void imprimir(Funcionario funcionario) {
        // TODO implementar a impressão do nome, salário e impostos (20%)

        BigDecimal imposto = funcionario.getSalario().multiply(new BigDecimal("0.2"));
        BigDecimal salarioLiquido = funcionario.getSalario().subtract(imposto);

        System.out.printf("Nome: %s | Salário bruto: R$ %.2f | Imposto: R$ %.2f  | Líquido: R$ %.2f%n", funcionario.getNome(),
                funcionario.getSalario().doubleValue(), imposto.doubleValue(), salarioLiquido.doubleValue());

    }
}