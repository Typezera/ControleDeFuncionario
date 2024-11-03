import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Gerente extends Funcionario
{
    public final double bonus = 0.05;
    public Gerente(String nome, double salario, String dataAdmissao, String cargo){
        DateTimeFormatter formatacao = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
        this.dataAdmissao = LocalDate.parse(dataAdmissao, formatacao);
    }

    public void gerenciar(){
        System.out.printf("O gerente %s acabou de fazer um planejamento." + nome);
    }

    public double calcularSalario() {
        double bonus = salario * this.bonus;
        salario += bonus;
//        System.out.println("O bonus do salario por atingir as metas será de: %d" + bonus);
//        System.out.println("Seu salario com o bonus é de: " + salario);
        return salario;
    }
}
