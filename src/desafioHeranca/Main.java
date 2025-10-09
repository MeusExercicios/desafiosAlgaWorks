package desafioHeranca;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o  nome do funcionário: ");
        String nome = scanner.nextLine();

        System.out.println("Digite o valor da hora de trabalho: ");
        double valorHoraTrabalhada = scanner.nextInt();

        System.out.println("Quantas horas foram trabalhadas: ");
        int horasTrabalhadas = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Qual mês e ano: ");
        String mesAno = scanner.nextLine();


        System.out.println("O funcionário é programador ? (1-sim/0-não): ");
        int funcao = scanner.nextInt();

        Funcionario funcionario = new Funcionario(nome, valorHoraTrabalhada);

        if (funcao == 0) {
            System.out.println(funcionario.gerarHolerite(horasTrabalhadas, mesAno));
        } else {
            System.out.println("Digite o valor do bônus: ");
            double valorBonus = scanner.nextDouble();
            Programador programador = new Programador(nome, valorHoraTrabalhada, valorBonus);
            System.out.println(programador.calcularSalario(horasTrabalhadas));

            System.out.println();
        }


        scanner.close();
    }
}
