package desafioMetodosEstaticos;

public class Areas {
    static double PI = 3.14;

    static double calcularAreaQuadrado(double medida) {
        return medida * medida;
    }

    static double calcularAreaCirculo(double medida) {
        return Areas.PI * (medida * medida);
    }
}
