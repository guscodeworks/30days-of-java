package day15.application;

import day15.entities.ConversorDolar;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("### Conversor de Dolar ###");
        System.out.print("Cotação do dia: ");
        double cotacaoDolar = sc.nextDouble();
        System.out.print("Valor do dolar comprado: ");
        double quantidadeDolares = sc.nextDouble();

        quantidadeDolares = ConversorDolar.dolarParaReal(cotacaoDolar, quantidadeDolares);

        System.out.printf("Precisará pagar : R$ %.2f%n", quantidadeDolares);


        sc.close();
    }
}
