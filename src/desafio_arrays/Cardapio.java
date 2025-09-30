package desafio_arrays;

import java.util.Arrays;

public class Cardapio {

    ItemCardapio[] itens = new ItemCardapio[0];

    void adicionarItem(ItemCardapio item) {
        this.itens = Arrays.copyOf(this.itens,this.itens.length+1);
        itens[itens.length - 1] = item;
    }

    void removerItem(int indice) {
        int [] novosItens = new int [itens.length-1];
        int indiceRemover = indice - 1;
        System.arraycopy(itens,0,novosItens,0,indiceRemover);
    }

    void imprimirItensCardapio(double precoMinimo, double precoMaximo) {

    }

}
