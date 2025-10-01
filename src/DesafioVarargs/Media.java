package DesafioVarargs;

public class Media {

    static double calcularMedia(int quantidade, double... notas) {
        double soma = 0.0;
        for (double nota : notas) {
            soma += nota;
        }
        return soma / quantidade;
    }
}
