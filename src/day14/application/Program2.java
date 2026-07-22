package day14.application;

import day14.entities.Funcionario;

import java.util.Locale;
import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        Funcionario funcionario = new Funcionario();

        System.out.println("### Calculador de Salario Liquido ###");
        System.out.print("Nome: ");
        funcionario.name = sc.nextLine();
        System.out.print("Salario bruto: ");
        funcionario.salarioBruto = sc.nextDouble();
        System.out.print("Taxa fixas: ");
        funcionario.taxa = sc.nextDouble();

        System.out.print("Funcionario: " + funcionario);

        System.out.println();
        System.out.print("Qual a porcentagem para adicionar ao salário: ");
        double porcentagem = sc.nextDouble();
        funcionario.AumentarSalario(porcentagem);

        System.out.print("Atualização: " + funcionario);

        sc.close();
    }
}
