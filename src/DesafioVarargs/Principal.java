package DesafioVarargs;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a quantidade de valores que quer cadastrar: ");
        int quantidade = scanner.nextInt();

        double[] novosValores = new double[quantidade];

        for (int i = 0; i < quantidade; i++) {
            System.out.println("Digite a nota " + (i + 1));
            novosValores[i] = scanner.nextDouble();
        }

        double resultado = Media.calcularMedia(novosValores);

        if (resultado == 0) {
            System.out.println("Você não digitou pelo menos 2 números");
        } else {
            System.out.println(resultado);
        }
    }
}
