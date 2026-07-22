package day15.application;

import day15.entities.ConversorTemperatura;

import java.util.Locale;
import java.util.Scanner;

public class Program3 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double temp, resultado;
        int opcao;

        System.out.println("### Conversor de Temperatura ###");

        System.out.println("1 - Converter Celsius para Fahrenheit");
        System.out.println("2 - Converter Fahrenheit para Celsius");
        System.out.print("Escolhe uma opção: ");
        opcao = sc.nextInt();

        System.out.print("Digite a temperatura: ");
        temp = sc.nextDouble();

        if (opcao == 1) {
            resultado = ConversorTemperatura.converterCelsius(temp);
            System.out.printf("Resultado: %.2f%n", resultado);
        } else if (opcao == 2) {
            resultado = ConversorTemperatura.converterFahrenheit(temp);
            System.out.printf("Resultado: %.2f%n", resultado);
        } else {
            System.out.println("Opção invalida!!");
        }


        sc.close();
    }
}
