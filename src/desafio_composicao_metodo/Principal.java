package desafio_composicao_metodo;

public class Principal {
    public static void main(String[] args) {
        ContratoTrabalho contratoTrabalho = new ContratoTrabalho();
        Registro registro = new Registro();
        FolhaPagamento resultado = new FolhaPagamento();

        contratoTrabalho.valorHoraNormal = 100;
        contratoTrabalho.valorHoraExtra = 200;

        registro.quantidadeHorasNormaisTrabalhadas = 44;
        registro.quantidadeHorasExtras = 10;

        contratoTrabalho.funcionario.nome = "Vitor";
        contratoTrabalho.funcionario.quantidade_de_filhos = 3;

        if (contratoTrabalho.filhos) {
            System.out.println("Resultado " + resultado.calcularSalario(contratoTrabalho) + "\nInformações " +
                    contratoTrabalho.funcionario.informarFuncionario(contratoTrabalho.funcionario.nome,
                            contratoTrabalho.funcionario.quantidade_de_filhos));
        } else {
            System.out.println("Resultado " + resultado.calcularSalarioAcrescimo(contratoTrabalho)
                    + "Informações " +
                    contratoTrabalho.funcionario.informarFuncionario(contratoTrabalho.funcionario.nome,
                            contratoTrabalho.funcionario.quantidade_de_filhos));
        }

    }
}
