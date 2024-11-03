import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Programador extends Funcionario
{
    public Programador(String nome, double salario, String dataAdmissao, String cargo){
        DateTimeFormatter formatacao = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
        this.dataAdmissao = LocalDate.parse(dataAdmissao, formatacao);
    }

    public void desenvolveu(){
        System.out.printf("O desenvolvedor %s acabou de criar uma solução!" + nome);
    }

    @Override
    public double calcularSalario() {
        return salario;
    }
}
