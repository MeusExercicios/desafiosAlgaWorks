package desafio_composicao_metodo;

public class Principal {
    public static void main(String[] args) {
        ContratoTrabalho contratoTrabalho = new ContratoTrabalho();

        contratoTrabalho.valorHoraNormal = 100;
        contratoTrabalho.valorHoraExtra = 200;

        contratoTrabalho.registro.quantidadeHorasNormaisTrabalhadas = 44;
        contratoTrabalho.registro.quantidadeHorasExtras = 10;

        contratoTrabalho.funcionario.nome = "Vitor";
        contratoTrabalho.funcionario.quantidade_de_filhos = 3;

        if (contratoTrabalho.funcionario.temFilho(contratoTrabalho.funcionario.quantidade_de_filhos)) {
            System.out.println(contratoTrabalho.folhaPagamento.calcularSalarioAcrescimo(contratoTrabalho));
        }else {
            System.out.println(contratoTrabalho.folhaPagamento.calcularSalario(contratoTrabalho));
        }
    }
}
