package desafioLambda;

import java.math.BigDecimal;
import java.util.Objects;

public class Funcionario implements Comparable<Funcionario> {

    private final String nome;
    private final BigDecimal salario;
    private final boolean ativo;

    public Funcionario(String nome, BigDecimal salario, boolean ativo) {
        this.nome = nome;
        this.salario = salario;
        this.ativo = ativo;
    }

    public String getNome() {
        return nome;
    }

    public BigDecimal getSalario() {
        return salario;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public boolean isInativo() {
        return !isAtivo();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Funcionario that = (Funcionario) o;
        return Objects.equals(salario, that.salario);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(salario);
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                ", ativo=" + ativo +
                '}';
    }


    @Override
    public int compareTo(Funcionario o) {
        return this.getSalario().compareTo(o.getSalario());
    }
}
