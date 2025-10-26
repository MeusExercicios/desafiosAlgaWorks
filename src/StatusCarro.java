public enum StatusCarro {
    VENDIDO("Vendido"),
    NAO_VENDIDO("Não Vendido");

    StatusCarro(String nomes) {
        this.nomes = nomes;
    }

    private String nomes;

    public String getNomes() {
        return nomes;
    }

    public void setNomes(String nomes) {
        this.nomes = nomes;
    }
}
