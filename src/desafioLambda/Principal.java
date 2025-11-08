package desafioLambda;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;

public class Principal {

    public static void main(String[] args) {
        var funcionarios = new ArrayList<Funcionario>();
        funcionarios.add(new Funcionario("João", new BigDecimal("19000"), true));
        funcionarios.add(new Funcionario("Maria", new BigDecimal("5000"), true));
        funcionarios.add(new Funcionario("Manoel", new BigDecimal("13000"), true));
        funcionarios.add(new Funcionario("Sebastião", new BigDecimal("12000"), false));

        // TODO remover funcionários inativos
        Iterator<Funcionario> it = funcionarios.iterator();

        while (it.hasNext()) {
            Funcionario funcionario = it.next();

            if (funcionario.isInativo()) {
                it.remove();
            } else {
                System.out.println("Funcionário ativo: " + funcionario.getNome());
            }
        }
    }
}


        // TODO ordenar funcionários pelo valor do salário

        // TODO iterar e imprimir funcionários usando o método estático imprimir


//    private static void imprimir(Funcionario funcionario) {
//        // TODO implementar a impressão do nome, salário e impostos (20%)
//    }
//
