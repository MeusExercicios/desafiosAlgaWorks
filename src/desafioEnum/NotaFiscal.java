package desafioEnum;

public class NotaFiscal {
    private final Integer numero;
    private final String descricao;
    private final double valor;
    private StatusEmissao statusEmissao;

    public NotaFiscal(Integer numero, String descricao, double valor, StatusEmissao statusEmissao) {
        this.numero = numero;
        this.descricao = descricao;
        this.valor = valor;
        this.statusEmissao = statusEmissao;
    }

    public Integer getNumero() {
        return numero;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getValor() {
        return valor;
    }

    public StatusEmissao getStatusEmissao() {
        return statusEmissao;
    }

    public void cancelar() {
        if ((statusEmissao == StatusEmissao.EMITIDA && getValor() >= 1_000)
                || statusEmissao == StatusEmissao.NAO_EMITIDA) {
            throw new IllegalStateException("Não foi possível cancelar a nota fiscal");
        }

        statusEmissao = StatusEmissao.CANCELADA;
    }

    public void emitir() {
        statusEmissao = statusEmissao.emitir();
        System.out.println("Novo status: " + statusEmissao.getNome());
    }


    public String getDescricaoCompleta() {
        return String.format("Nota fiscal #%d (%s) no valor de R$%.2f está %s",
                numero, descricao, valor, statusEmissao.getNome());
    }

}
