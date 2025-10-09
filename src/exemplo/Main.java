package exemplo;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // 1️⃣ Lista externa
        List<String> listaExterna = new ArrayList<>();
        listaExterna.add("Maçã");
        listaExterna.add("Banana");

        // 2️⃣ Passamos a lista para a Caixa
        Caixa caixa = new Caixa(listaExterna);

        // 3️⃣ Alteramos a lista externa
        listaExterna.add("Laranja");

        // 4️⃣ Pegamos uma lista da caixa e alteramos essa lista retornada
        List<String> copiaDaCaixa = caixa.getItens();
        copiaDaCaixa.add("Abacaxi");

        // 5️⃣ Imprimimos o que está dentro da caixa
        System.out.println("Conteúdo interno da caixa: " + caixa.getItens());

        // 6️⃣ Imprimimos as outras listas
        System.out.println("Lista externa: " + listaExterna);
        System.out.println("Cópia retornada do getter: " + copiaDaCaixa);
    }
}