package desafio_composicao_metodo;

public class FolhaPagamento {

    Holerite holerite;


    Holerite calcularSalario(ContratoTrabalho contratoTrabalho) {
        return (contratoTrabalho.valorHoraNormal * contratoTrabalho.registro.quantidadeHorasNormaisTrabalhadas) +
                (contratoTrabalho.valorHoraExtra * contratoTrabalho.registro.quantidadeHorasExtras);
    }

    double calcularSalarioAcrescimo(ContratoTrabalho contratoTrabalho) {
        return ((contratoTrabalho.valorHoraNormal * contratoTrabalho.registro.quantidadeHorasNormaisTrabalhadas) +
                (contratoTrabalho.valorHoraExtra * contratoTrabalho.registro.quantidadeHorasExtras)) * 1.1;
    }
}
