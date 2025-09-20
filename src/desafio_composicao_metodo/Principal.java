package desafio_composicao_metodo;

public class Principal {
    public static void main(String[] args) {
        Holerite holerite = new Holerite();
        Funcionario funcionario = new Funcionario();
        Registro registro = new Registro();


        holerite.valorHoraNormaisTrabalhadas = 100.0;
        holerite.valorHoraExtra = 200;

        registro.quantidadeHorasNormaisTrabalhadas = 44;
        registro.quantidadeHorasExtras = 10;

        funcionario.nome = "Vitor";
        funcionario.quantidade_de_filhos = 3;

        boolean resultado = funcionario.temFilho(funcionario.quantidade_de_filhos);

        holerite.adicionalFilho = 20;

        if (resultado) {
            System.out.println("Contra-cheque: " + holerite.informar(funcionario) +
                    " O valor total será: " + holerite.calcularSalario(registro));
        }


    }
}
