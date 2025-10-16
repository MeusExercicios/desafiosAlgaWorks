package desafioPolimorfismo;

public class GestorDeImpostos {
    Pessoa pessoa;
    private double valorTotalImpostos;

    public void adicionar(Pessoa pessoa) {
        double imposto = pessoa.calcularImposto();
        System.out.println("Impostos devidos de " + pessoa.getNome() + ": " + imposto);
        valorTotalImpostos += imposto;
    }

    public double getValorTotalImpostos() {
        return valorTotalImpostos;
    }


}
