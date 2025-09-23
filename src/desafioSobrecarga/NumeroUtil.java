package desafioSobrecarga;

public class NumeroUtil {

    static void maiorNumero(int valorUm, int valorDois) {
        if (valorUm < valorDois) {
            System.out.println(valorDois);
        } else  {
            System.out.println(valorUm);
        }
    }

    static void maiorNumero(int valorUm, int valorDois, int valorTres) {
        if (valorUm < valorDois && valorTres < valorUm) {
            System.out.println(valorDois);
        }

        else if (valorDois < valorTres && valorUm < valorDois) {
            System.out.println(valorTres);
        }
        else {
            System.out.println(valorUm);
        }
    }

    static void maiorNumero(double valorUm, double valorDois) {
        if (valorUm < valorDois) {
            System.out.println(valorDois);
        }  else  {
            System.out.println(valorUm);
        }
    }

    static void maiorNumero(double valorUm, double valorDois, double valorTres) {
        if (valorUm < valorDois && valorTres < valorUm) {
            System.out.println(valorDois);
        }

        else if (valorDois < valorTres && valorUm < valorDois) {
            System.out.println(valorTres);
        }
        else {
            System.out.println(valorUm);
        }
    }
}
