package DesafioVarargs;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double

        System.out.println("Digite a quantidade de valores que quer cadastrar: ");
        int quantidade = scanner.nextInt();

        System.out.println("Digite as notas: ");

        for (int i = 0; i < quantidade; i++) {
            System.out.println("Digite a nota " + (i + 1));
            valores.add(scanner.nextDouble());
        }

        Media.calcularMedia(quantidade,valores);

    }
}
