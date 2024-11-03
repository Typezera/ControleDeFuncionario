import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Empresa
{
    public static void main(String[] args){
        List<Funcionario> funcionarios = new ArrayList<>();

        funcionarios.add(new Gerente("João", 5000, "2023/10/05", "Gerente"));
        funcionarios.add(new Vendedor("Fernanda", 2000, "2020/09/20", "Vendedor"));
        funcionarios.add(new Programador("José", 10000, "2020/09/20", "Programador"));

        for(Funcionario funci : funcionarios){
            System.out.println("Nome: " + funci.nome + " Cargo: " + funci.cargo);
            System.out.println("Salário: " + funci.calcularSalario());
        }
    }
}
