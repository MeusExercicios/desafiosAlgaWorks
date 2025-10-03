package desafio_construtores;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = scanner.next();

        System.out.println("Digite o seu saldo de pontos: ");
        int saldoDePontos = scanner.nextInt();

        Participante participante = new Participante(nome);
        Participante novoParticipante = new Participante(nome, saldoDePontos);

        System.out.println(participante);

        System.out.println(novoParticipante);


        scanner.close();
    }
}
