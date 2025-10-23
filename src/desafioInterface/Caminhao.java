package desafioInterface;

public class Caminhao extends VeiculoAutomotor {
    private int quantidadeEixos;

    public Caminhao(String modelo, double valorMercado, int anoFabricacao, int quantidadeEixos) {
        super(modelo, valorMercado, anoFabricacao);
        this.quantidadeEixos = quantidadeEixos;
    }

    public int getQuantidadeEixos() {
        return quantidadeEixos;
    }

    public void setQuantidadeEixos(int quantidadeEixos) {
        this.quantidadeEixos = quantidadeEixos;
    }

    @Override
    public double calcularValorPremio() {
        return (getValorMercado() * 0.02) + (getQuantidadeEixos() * 50);
    }

    @Override
    public String descrever() {
        return "Caminhao" + getModelo() + getValorMercado() + getQuantidadeEixos();
    }
}
