package exemplo;

import java.util.ArrayList;
import java.util.List;

class Caixa {
    private List<String> itens;

    // Construtor com cópia defensiva
    public Caixa(List<String> itens) {
        // Aqui criamos um NOVO ArrayList copiando o conteúdo do parâmetro
        this.itens = new ArrayList<>(itens);
    }

    // Getter com cópia defensiva
    public List<String> getItens() {
        // Sempre devolve uma NOVA cópia
        return new ArrayList<>(itens);
    }
}