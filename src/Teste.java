import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Teste {
    public static void main(String[] args) {

        Set<Integer> numeros = new HashSet<Integer>();
        numeros.add(1);
        numeros.add(20);
        numeros.add(3);
        numeros.add(40);
        numeros.add(5);

        for (Integer numero : numeros) {
            System.out.println(numero);
        }
/*
        Iterator<Integer> iterator = numeros.iterator();

        while(iterator.hasNext()){
            Integer numero = iterator.next();
            System.out.println(numero);
        }

 */
    }
}
