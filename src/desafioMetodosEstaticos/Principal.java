package desafioMetodosEstaticos;

public class Principal {
    public static void main(String[] args) {

        double quadrado = Areas.calcularAreaQuadrado(50);
        double circulo = Areas.calcularAreaCirculo(20);

        System.out.println("Resultado: " + quadrado);
        System.out.println("Resultado: " + circulo);
    }
}
