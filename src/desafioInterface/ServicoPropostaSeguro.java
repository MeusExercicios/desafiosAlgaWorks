package desafioInterface;

public class ServicoPropostaSeguro {

    private BemSeguravel bemSeguravel;

    public ServicoPropostaSeguro() {
    }

    public ServicoPropostaSeguro(BemSeguravel bemSeguravel) {
        this.bemSeguravel = bemSeguravel;
    }

    public BemSeguravel getBemSeguravel() {
        return bemSeguravel;
    }

    public void setBemSeguravel(BemSeguravel bemSeguravel) {
        this.bemSeguravel = bemSeguravel;
    }

    public void emitir(BemSeguravel bemSeguravel) {
        System.out.println(bemSeguravel.descrever());
        System.out.println("\nvalor do seguro: " + bemSeguravel.calcularValorPremio());
    }
}
