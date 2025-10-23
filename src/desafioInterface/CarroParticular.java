package desafioInterface;

public class CarroParticular extends VeiculoAutomotor {
    public CarroParticular(String modelo,double valorMercado,int anoFabricacao) {
        super(modelo,valorMercado,anoFabricacao);
    }

    @Override
    public double calcularValorPremio() {
        if (getAnoFabricacao() > 1999) {
            return (getValorMercado() * 0.04);
        } else {
            return (getValorMercado() * 0.04) * 1.05;
        }
    }

    @Override
    public String descrever() {
        return "Modelo: " + getModelo() + "\nAno: " + getAnoFabricacao();

    }

}
