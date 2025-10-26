package desafioEnum;

public enum StatusEmissao {
    EMITIDA("Emitida") {
        @Override
        public StatusEmissao emitir() {
            throw new IllegalStateException("A nota já foi emitida");
        }
    },
    NAO_EMITIDA("Não Emitida"){
        @Override
        public StatusEmissao emitir() {
            return EMITIDA;
        }
    },
    CANCELADA("Cancelada"){
        @Override
        public StatusEmissao emitir() {
            throw new IllegalStateException("Não dar para emitir nota cancelada");
        }
    };

    private String nome;

    StatusEmissao(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public abstract  StatusEmissao emitir();


}
