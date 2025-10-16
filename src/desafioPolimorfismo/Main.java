package desafioPolimorfismo;

public class Main {
    public static void main(String[] args) {

        var gestorDeImposto = new GestorDeImpostos();

        var joao = new PessoaFisica("João Vitor",45000);
        var ana = new PessoaFisica("Ana",180000);

        var barDoZe = new EmpresaSimples("Bar do Zé",250000,160000);
        var codeConsultoria = new EmpresaLucroReal("Code Consultoria", 300000,100000);

        gestorDeImposto.adicionar(joao);
        gestorDeImposto.adicionar(ana);
        gestorDeImposto.adicionar(barDoZe);
        gestorDeImposto.adicionar(codeConsultoria);

        System.out.println("Total de impostos arrecados: " + gestorDeImposto.getValorTotalImpostos());
    }
}
