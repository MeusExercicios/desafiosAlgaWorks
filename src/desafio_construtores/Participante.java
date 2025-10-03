package desafio_construtores;

public class Participante {
    String nome;
    int saldoDePontos;

    Participante(String nome){
        this.nome = nome;
    }

    Participante(String nome, int saldoDePontos) {
        this.nome = nome;
        this.saldoDePontos = saldoDePontos;
    }

    @Override
    public String toString() {
        return "Participante{" +
                "nome='" + nome + '\'' +
                ", saldoDePontos=" + saldoDePontos +
                '}';
    }
}
