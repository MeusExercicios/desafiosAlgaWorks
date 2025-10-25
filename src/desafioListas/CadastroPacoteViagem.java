package desafioListas;

import java.util.*;

public class CadastroPacoteViagem {

    // TODO declarar lista de pacotes de viagem aqui
    private final List<PacoteViagem> pacotes = new ArrayList<>();

    public void adicionar(String descricao, double precoDiaria) {
        // TODO adicionar pacote na lista, validando antes se
        //  já existe usando contains (lançar exceção)
        if (pacotes.contains(new PacoteViagem(descricao, precoDiaria))) {
            throw new JaExisteException("O pacote já existe");
        }
        pacotes.add(new PacoteViagem(descricao, precoDiaria));
    }

    public List<PacoteViagem> obterTodos() {
        // TODO retornar lista de pacotes
        if (pacotes.isEmpty()) {
            throw new NaoTemPacoteException("Nenhum pacote encontrada");
        }
        return pacotes;
    }

    public void ordenar() {
        // TODO ordenar pacotes pela ordem natural
        Collections.sort(pacotes);
    }

    public void ordenarPorPrecoDecrescente() {
        // TODO ordenar pacotes pelo preço (decrescente)
        Collections.sort(pacotes, Collections.reverseOrder());
    }

    public void removerPorDescricao(String descricao) {
        // TODO iterar nos pacotes com Iterator e remover aqueles com descrição informada,
        //  lançando exceção se nenhum pacote foi removido
        boolean removido = false;

        Iterator<PacoteViagem> iterator = pacotes.iterator();
        while (iterator.hasNext()) {
            PacoteViagem pacote = iterator.next();
            if (pacote.getDescricao().equalsIgnoreCase(descricao)) {
                iterator.remove();
                removido = true;
            }
        }
        if (!removido) {
            throw new IllegalArgumentException("Nenhum pacote encontrada");
        }
    }

    public PacoteViagem buscarPorDescricao(String descricao) {
        // TODO iterar pacotes com enhanced for, localizar e retornar
        //  pacote com descrição informada (ou lançar exceção se não encontrar)
        for (PacoteViagem pacote : pacotes) {
            if (pacote.getDescricao().equalsIgnoreCase(descricao)) {
                return pacote;
            }
        }
        throw new IllegalArgumentException("Nenhum pacote encontrada");
    }

}