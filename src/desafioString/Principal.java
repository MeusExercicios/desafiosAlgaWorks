package desafioString;

public class Principal {

    public static void main(String[] args) {

//        String[] emailsValidos = { "joao@algaworks.com", "joao_silva@algaworks.com",
//                "joao.silva@algaworks.com", "joao-silva@algaworks.com",
//                "joao123@algaworks.com", "joao@algaworks123.com",
//                "joao@java.algaworks.com", "joao@alga-works.com", "joao@email.me",
//                "Joao@algaworks.com"
//        };


//        String[] emailsInvalidos = { "", " joao@algaworks.com", "joao@algaworks.com ",
//                "joao @algaworks.com", "joao@ algaworks.com", "joao@algaworks .com",
//                "joao@algaworks. com", "joaoalgaworks.com", "@algaworks.com",
//                "joao@algaworks", "joao@algaworks.abcdef", "joao@alga@works.com",
//                "joao@algaworks.co1", "joao@AlgaWorks.com", "joao@algaworks.Com",
//                "joao.com@algaworks", "joao@.com", "joao@algaworks.",
//                "jo#ao@algaworks.com", "joao@alga#works.com"
//        };

        //Caso 1: ""
        /*
        boolean emailVazio = email.isBlank();

        if (emailVazio) {
            System.out.println("email vazio");
        } else {
            System.out.println("Emails true");
        }
         */

        //Caso 2: " joao@algaworks.com"
        /*
        String email = " joao@algaworks.com";

        if (email.contains(" ")){
            System.out.println("O email tem espaço em branco");
        } else {
            System.out.println("O email não tem espaço em branco");
        }
    }
         */

        //Caso 3: "@algaworks.com"
        /*

        String email = "@algaworks.com";

        if (email.charAt(0) == '@'){
            System.out.println("email não tem nome antes do @");
        } else {
            System.out.println("email correto");
        }

        */


//        for (String email : emailsValidos) {
//            if (!ValidadorEmail.validar(email)) {
//                throw new RuntimeException(
//                        String.format("E-mail %s é válido, mas validador retornou false", email));
//            }
//        }

//        for (String email : emailsInvalidos) {
//            if (ValidadorEmail.validar(email)) {
//                throw new RuntimeException(
//                        String.format("E-mail %s é inválido, mas validador retornou true", email));
//            }
//        }

//        System.out.println("Sucesso! Validador funcionando corretamente.");
    }
}


