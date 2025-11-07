package desafioRegex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

        String json = """
                {
                    "id": 1,
                    "nome": "João da Silva"
                },
                {
                    "id": 2,
                    "nome":"Maria Abadia"
                },
                {
                    "id": 3,
                    "nome":
                        "Sebastião Carvalho"
                }
                """;

        Pattern formato = Pattern.compile("\"nome\"\\s*:\\s*\"([^\"]+)\"");

        Matcher matcher = formato.matcher(json);

        while (matcher.find()) {
            System.out.println("Nomw encontrado: " + matcher.group());
        }
    }
}

