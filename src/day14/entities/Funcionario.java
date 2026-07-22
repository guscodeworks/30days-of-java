package day14.entities;

public class Funcionario {
    public String name;
    public double salarioBruto;
    public double taxa;

    public double SalarioLiquido() {
        return salarioBruto - taxa;
    }

    public void AumentarSalario(double porcentagem) {
        salarioBruto += salarioBruto * porcentagem / 100.0;
    }

    public String toString() {
        return name + ", " + String.format("R$ %.2f", SalarioLiquido());
    }
}
