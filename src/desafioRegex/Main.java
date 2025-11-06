package desafioRegex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
/*
        String nome = "Vitor 29";
        Pattern padrao = Pattern.compile("\\d+");
        Matcher aplicacao = padrao.matcher(nome);


        while (aplicacao.find()){
            System.out.println(aplicacao.group());
        }

 */

        String json = "{\n" +
                "    \"id\": 1,\n" +
                "    \"nome\": \"João da Silva\"\n" +
                "},\n" +
                "{\n" +
                "    \"id\": 2,\n" +
                "    \"nome\":\"Maria Abadia\"\n" +
                "},\n" +
                "{\n" +
                "    \"id\": 3,\n" +
                "    \"nome\":\n" +
                "        \"Sebastião Carvalho\"\n" +
                "}";
    }
}

