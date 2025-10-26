import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Proprietario joao = new Proprietario("João","06008555384");
        Proprietario vera = new Proprietario("Vera","30981328253");

        Carro fusca = new Carro("Fusca","45a88d");
        Carro fiat = new Carro("Fiat","45a77d");

        Map<Carro,Proprietario> proprietarios = new HashMap<>();
        proprietarios.put(fusca,vera);
        proprietarios.put(fiat,joao);

        //System.out.println(proprietarios.toString());
        System.out.println(proprietarios.get(fusca));
    }
}
