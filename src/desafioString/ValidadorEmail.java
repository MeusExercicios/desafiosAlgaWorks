package desafioString;

public class ValidadorEmail {

    public static boolean validar(String email) {

        /*
        SITUAÇÃO 1:


        String email = "  @algaworks.com";

        int indice = email.strip().indexOf("@");

        if (indice != 0 && indice != -1){

        System.out.println("O email está válido " + email);

        } else {

        System.out.println("Email inválido. @ colocado de forma errada" + email);

        }

         */

        /*
        String email = "";

        if (email.isBlank()){

        System.out.println("O email está vazio");

        }
         */

        String emailValidador = email;

        emailValidador.isBlank();

        return false;
    }

}
