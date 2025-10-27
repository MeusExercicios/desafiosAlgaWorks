public class Test2 {
    public static void main(String[] args) {


        String nome = "João Vitor Costa";


        int posicao =  nome.indexOf(" ");

        int posicao2 = nome.indexOf(" ", posicao + 1);

        String segundoNome = nome.substring(posicao2);

        System.out.println(segundoNome);
    }
}
