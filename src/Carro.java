import java.util.Objects;

public class Carro {
    private final String marca;
    private final String placa;


    public Carro(String marca, String placa) {
        Objects.requireNonNull(marca);
        Objects.requireNonNull(placa);
        this.marca = marca;
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public String getPlaca() {
        return placa;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Carro carro = (Carro) o;
        return Objects.equals(placa, carro.placa);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(placa);
    }

    @Override
    public String toString() {
        return "Carro{" +
                "marca='" + marca + '\'' +
                ", placa='" + placa + '\'' +
                '}';
    }
}
