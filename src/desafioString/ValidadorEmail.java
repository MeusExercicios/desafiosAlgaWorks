package desafioString;

public class ValidadorEmail {

    public static boolean validar(String email) {

        boolean emailNuloOuVazio = (email == null) || email.isBlank();
        if (emailNuloOuVazio) return false;

        boolean temEspacoNoComecoOuFim = !email.equals(email.strip());
        if (temEspacoNoComecoOuFim) return false;

        boolean temEspacoNoMeio = email.contains(" ");
        if (temEspacoNoMeio) return false;

        int qtdArroba = email.length() - email.replace("@", "").length();
        boolean quantidadeArrobaValida = (qtdArroba == 1);
        if (!quantidadeArrobaValida) return false;

        boolean comecaComArroba = email.charAt(0) == '@';
        if (comecaComArroba) return false;

        String[] partes = email.split("@");
        String usuario = partes[0];
        String dominio = partes[1];

        boolean usuarioVazio = usuario.isEmpty();
        if (usuarioVazio) return false;

        boolean dominioVazio = dominio.isEmpty();
        if (dominioVazio) return false;

        boolean dominioTemPonto = dominio.contains(".");
        if (!dominioTemPonto) return false;

        boolean dominioTerminaComPonto = dominio.endsWith(".");
        if (dominioTerminaComPonto) return false;

        boolean dominioComecaComPonto = dominio.charAt(0) == '.';
        if (dominioComecaComPonto) return false;

        boolean dominioMinusculo = dominio.equals(dominio.toLowerCase());
        if (!dominioMinusculo) return false;

        int posUltimoPonto = dominio.lastIndexOf(".");
        String tld = dominio.substring(posUltimoPonto + 1);

        boolean tldTamanhoValido = tld.length() >= 2 && tld.length() <= 4;
        if (!tldTamanhoValido) return false;

        boolean tldSomenteLetras = true;
        for (int i = 0; i < tld.length(); i++) {
            char c = tld.charAt(i);
            if (!(c >= 'a' && c <= 'z')) {
                tldSomenteLetras = false;
                break;
            }
        }
        if (!tldSomenteLetras) return false;

        boolean caracteresValidos = true;
        for (int i = 0; i < email.length(); i++) {
            char c = email.charAt(i);

            boolean letraMinuscula = c >= 'a' && c <= 'z';
            boolean letraMaiuscula = c >= 'A' && c <= 'Z';
            boolean numero = c >= '0' && c <= '9';
            boolean simboloValido = c == '.' || c == '_' || c == '-' || c == '@';

            if (!(letraMinuscula || letraMaiuscula || numero || simboloValido)) {
                caracteresValidos = false;
                break;
            }
        }
        if (!caracteresValidos) return false;

        return true;
    }
}
