package desafios;

import java.util.Scanner;

public class Invertido {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número: ");
        String num = scanner.nextLine();

        StringBuilder resultado = new StringBuilder();

        int tamanho = num.length();


        while (tamanho > 0) {
            resultado.append(num.substring(tamanho - 1, tamanho));
            tamanho--;
        }
        System.out.println(resultado);


        scanner.close();

    }
}