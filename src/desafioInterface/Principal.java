package desafioInterface;

public class Principal {
    public static void main(String[] args) {


        ServicoPropostaSeguro servicoPropostaSeguro = new ServicoPropostaSeguro();

        CarroParticular carroParticular = new CarroParticular("Honda",25000,2022);

        Caminhao caminhao = new Caminhao("Truck", 100000, 1999,5);

        ImovelResidencial imovelResidencial = new ImovelResidencial(245000,64);

        servicoPropostaSeguro.emitir(carroParticular);
        servicoPropostaSeguro.emitir(caminhao);
        servicoPropostaSeguro.emitir(imovelResidencial);

    }

}
