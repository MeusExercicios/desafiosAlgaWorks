package desafioInterface;

public class ImovelResidencial implements BemSeguravel {
    private double valorMercado;
    private int areaContruida;

    public ImovelResidencial(double valorMercado, int areaContruida) {
        this.valorMercado = valorMercado;
        this.areaContruida = areaContruida;
    }

    public double getValorMercado() {
        return valorMercado;
    }

    public void setValorMercado(double valorMercado) {
        this.valorMercado = valorMercado;
    }

    public int getAreaContruida() {
        return areaContruida;
    }

    public void setAreaContruida(int areaContruida) {
        this.areaContruida = areaContruida;
    }

    @Override
    public double calcularValorPremio() {
        return (valorMercado * 0.01) + (areaContruida * 0.3);
    }

    @Override
    public String descrever() {
        return valorMercado + " - " + areaContruida;
    }
}
