import java.util.Objects;

public class Carro {
    private final String marca;
    private final String placa;
    private StatusCarro status;

    public Carro(String marca, String placa, StatusCarro status) {
        this.marca = marca;
        this.placa = placa;
        this.status = status;
    }

    public String getMarca() {
        return marca;
    }


    public String getPlaca() {
        return placa;
    }


    public StatusCarro getStatus() {
        return status;
    }

    public void setStatus(StatusCarro status) {
        this.status = status;
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
                ", status=" + status.getNomes() +
                '}';
    }
}

