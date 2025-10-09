package desafioHeranca;

public record Holerite(String nome, String mesAno, double valorSalario) {

    public void imprimir() {
        System.out.println("Nome: " + this.nome);
        System.out.println("MesAno: " + this.mesAno);
        System.out.println("Salario: " + this.valorSalario);
    }
}
