package desafio_arrays;
//parte 1
public class Calendario {

    static String obterNomeMes(int numeroMes) {

        String [] meses = new String[]{"Janeiro","Fevereiro","Março","Abril","Maio","Junho",
                "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};

        return "Você escolheu: " + meses[numeroMes - 1];
    }

    public static void main(String[] args) {
        String mes = Calendario.obterNomeMes(9);

        System.out.println(mes);
    }

}