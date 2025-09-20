package desafio_composicao_metodo;

public class Holerite {
    Funcionario funcionario;
    double valorHoraNormaisTrabalhadas;
    double valorHoraExtra;
    double adicionalFilho;

    double calcularSalario() {
        return (valorHoraNormaisTrabalhadas * funcionario.registro.quantidadeHorasNormaisTrabalhadas) +
                (valorHoraExtra * funcionario.registro.quantidadeHorasExtras)*(1+adicionalFilho);
    }

    String informar() {
        return "Funcionário: " + funcionario.nome + " Trabalhou " + (funcionario.registro.quantidadeHorasExtras
        + funcionario.registro.quantidadeHorasNormaisTrabalhadas + " possui " + funcionario.quantidade_de_filhos
        + " filhos " + "seu salário total deu: " + calcularSalario());
    }


}

