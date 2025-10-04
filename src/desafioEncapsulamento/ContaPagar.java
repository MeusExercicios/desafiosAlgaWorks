package desafioEncapsulamento;

public class ContaPagar {
    private String descricao;
    private double valor;
    private String dataVencimento;
    private boolean pago;
    Fornecedor fornecedor;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getAuxValor() {
        return valor;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(String dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public boolean isPago() {
        return getValor() == 0;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public void pagar() {
        if (getValor() == 0) {
            throw new IllegalArgumentException("Essa conta já foi paga");
        } else {
            setValor(getValor() - getValor());
        }
    }

    public void cancelarPagamento(double valor) {
        setValor(valor);
    }

    public void cancelarPagamento() {
        if (getValor() > 0) {
            throw new IllegalArgumentException("Não pode! Você está tentando cancelar uma conta pendente");
        }
    }
}