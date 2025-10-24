package desafioGenerics;

import desafioGenerics.estoque.Carro;
import desafioGenerics.estoque.GerenciadorEstoque;
import desafioGenerics.estoque.Roupa;

public class Principal {

    public static void main(String[] args) {
        GerenciadorEstoque<Roupa> estoqueRoupas = new GerenciadorEstoque<>();
        estoqueRoupas.adicionar(new Roupa("Camiseta básica branca", 20));
        estoqueRoupas.adicionar(new Roupa("Camiseta básica preta", 10));

        GerenciadorEstoque<Carro> estoqueCarros = new GerenciadorEstoque<>();
        estoqueCarros.adicionar(new Carro("BMW X1", 4));
        estoqueCarros.adicionar(new Carro("BMW X1", 4));
        estoqueCarros.adicionar(new Carro("Honda HR-V", 8));

        imprimirEstoque(estoqueRoupas, estoqueCarros);

    }


    private static void imprimirEstoque(GerenciadorEstoque<Roupa> estoqueRoupas, GerenciadorEstoque<Carro> estoqueCarros) {
        System.out.println("Estoque de roupas: " + estoqueRoupas.getQuantidadeTotal());
        System.out.println("Estoque de carros: " + estoqueCarros.getQuantidadeTotal());
    }

}
