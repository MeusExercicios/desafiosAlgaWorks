package desafioGenerics.estoque;

public class GerenciadorEstoque <T extends Estocavel> {

    private int quantidadeTotal;

    public void adicionar(T item) {
        quantidadeTotal += item.getQuantidadeEstoque();
    }

    public int getQuantidadeTotal() {
        return quantidadeTotal;
    }

}