package desafio_construtores;

public class Participante {
    private String nome;
    private int saldoDePontos;

    public Participante(String nome){
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


    public void creditarPontos(int pontos){
        this.saldoDePontos += pontos;
    }
}
