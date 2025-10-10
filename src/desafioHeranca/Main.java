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


        if (funcao == 0) {
            Funcionario funcionario = new Funcionario(nome, valorHoraTrabalhada);
            Holerite holerite = funcionario.gerarHolerite(horasTrabalhadas, mesAno);
            holerite.imprimir();
        } else {
            System.out.println("Digite o valor do bônus: ");
            double valorBonus = scanner.nextDouble();
            Programador programador = new Programador(nome, valorHoraTrabalhada, valorBonus);
            Holerite holerite = programador.gerarHolerite(horasTrabalhadas, mesAno);
            holerite.imprimir();
        }


        scanner.close();
    }
}
