package desafio_composicao_metodo;

public class Holerite {
    double valorHoraNormaisTrabalhadas;
    double valorHoraExtra;
    double adicionalFilho;

    double calcularSalario(Registro registro) {
        return ((valorHoraNormaisTrabalhadas * registro.quantidadeHorasNormaisTrabalhadas) +
                (valorHoraExtra * registro.quantidadeHorasExtras)) * (1 + adicionalFilho / 100);
    }

    String informar(Funcionario funcionario) {
        return "Funcionário: " + funcionario.nome + " possui " + funcionario.quantidade_de_filhos
                + " filhos ";
    }
}

