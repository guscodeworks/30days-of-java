package day6;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int idFuncionario, horasTrabalhadas;
        double valorHoras, salario;

        System.out.println("\n === Calculador de Salário ===");
        System.out.print("ID do funcinoario: ");
        idFuncionario = sc.nextInt();
        System.out.print("Horas trabalhadas: ");
        horasTrabalhadas = sc.nextInt();
        System.out.print("Valor por hora: ");

        valorHoras = sc.nextDouble();
        salario = horasTrabalhadas * valorHoras;

        System.out.printf("Salário desse funcionario: R$ %.2f%n", salario);
        sc.close();
    }
}
