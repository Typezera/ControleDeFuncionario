import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Vendedor extends Funcionario
{
    private double venda;
    private final double bonus = 0.05;
    public Vendedor(String nome, double salario, String dataAdmissao, String cargo){
        DateTimeFormatter formatacao = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
        this.dataAdmissao = LocalDate.parse(dataAdmissao, formatacao);
    }

    @Override
    public double calcularSalario() {
        double bonus = salario * this.bonus;
        salario += bonus;
        return salario;
    }
}
