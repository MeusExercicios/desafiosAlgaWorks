package desafio_composicao_metodo;

public class Principal {
    public static void main(String[] args) {
        Holerite holerite  = new Holerite();
        Funcionario funcionario = new Funcionario();
        Registro registro = new Registro();
        FolhaPagamento folhaPagamento = new FolhaPagamento();

        funcionario.holerite.valorHoraNormaisTrabalhadas = 100.0;
        funcionario.holerite.valorHoraExtra = 200;

        funcionario.registro.quantidadeHorasNormaisTrabalhadas = 44;
        funcionario.registro.quantidadeHorasExtras = 10;

        funcionario.nome= "Vitor";
        funcionario.quantidade_de_filhos = 3;

        boolean resultado = funcionario.temFilho(funcionario.quantidade_de_filhos);

        double porcentagemAdicionalFilho = 20;

        if (resultado) {
            funcionario.holerite.adicionalFilho = porcentagemAdicionalFilho;
            System.out.println(funcionario.holerite.informar());
        }



    }
}
