package desafio_arrays;

import java.util.Arrays;

public class Cardapio {

    ItemCardapio[] itens = new ItemCardapio[0];

    void adicionarItem(ItemCardapio item) {
        this.itens = Arrays.copyOf(this.itens, this.itens.length + 1);
        itens[itens.length - 1] = item;
    }

    void removerItem(int indice) {
        int indiceRemover = indice - 1;

        ItemCardapio[] novosItens = new ItemCardapio[this.itens.length - 1];

        System.arraycopy(this.itens, 0, novosItens, 0, indiceRemover);
        System.arraycopy(this.itens, indiceRemover + 1, novosItens, indiceRemover, this.itens.length - indiceRemover - 1);

        this.itens = novosItens;
    }

    void imprimirItensCardapio(double precoMinimo, double precoMaximo) {

        boolean encontrou = false;

        for (ItemCardapio item : this.itens) {

            if (item.preco >= precoMinimo && item.preco <= precoMaximo) {
                System.out.printf("- %s (R$ %.2f)%n", item.descricao, item.preco);
                encontrou = true;
            }

        }
    }

}