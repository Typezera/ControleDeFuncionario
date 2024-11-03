import java.time.LocalDate;

public abstract class Funcionario
{
    public String cargo;
    public String nome;
    public double salario;
    public LocalDate dataAdmissao;

    public abstract double calcularSalario();
}
