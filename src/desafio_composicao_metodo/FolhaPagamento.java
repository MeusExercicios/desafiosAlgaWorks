package desafio_composicao_metodo;

public class FolhaPagamento {

    ContratoTrabalho contratoTrabalho = new ContratoTrabalho();
    Registro registro = new Registro();

    double calcularSalario(ContratoTrabalho contratoTrabalho) {
        return (contratoTrabalho.valorHoraNormal * registro.quantidadeHorasNormaisTrabalhadas) +
                (contratoTrabalho.valorHoraExtra * registro.quantidadeHorasExtras);
    }

    double calcularSalarioAcrescimo(ContratoTrabalho contratoTrabalho) {
        return ((contratoTrabalho.valorHoraNormal * registro.quantidadeHorasNormaisTrabalhadas) +
                (contratoTrabalho.valorHoraExtra * registro.quantidadeHorasExtras)) * 1.1;
    }
}
