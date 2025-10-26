package desafioEnum;

public class Principal {

    public static void main(String[] args) {
        NotaFiscal nf = new NotaFiscal(123, "Macbook Pro", 18_000,StatusEmissao.NAO_EMITIDA);
        System.out.println(nf.getDescricaoCompleta());

        nf.emitir();
        System.out.println(nf.getDescricaoCompleta());

        nf.cancelar(); // IllegalStateException
        System.out.println(nf.getDescricaoCompleta());
    }

}