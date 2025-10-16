package desafioPolimorfismo;

public class EmpresaSimples extends PessoaJuridica {

    public static final double ALIQUOTA_IMPOSTO_FATURAMENTO = 0.6;

    public EmpresaSimples(String nome, double faturamentoAnual, double despesaAnual) {
        super(nome, faturamentoAnual, despesaAnual);
    }

    @Override
    public double calcularImposto() {
        return getFaturamentoAnual() * ALIQUOTA_IMPOSTO_FATURAMENTO;
    }
}
