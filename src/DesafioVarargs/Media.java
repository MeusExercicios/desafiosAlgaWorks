package DesafioVarargs;

public class Media {

    static double calcularMedia(double... notas) {
        if (notas.length >= 2) {
            double soma = 0.0;
            for (double nota : notas) {
                soma += nota;
            }
            return soma / notas.length;
        } else return 0;
    }
}
