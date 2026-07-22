package day15.application;

import day15.entities.Circulo;

import java.util.Locale;
import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double radius, area, circuferenca;

        System.out.println("### Calculador Area/Circuferencia ###");

        System.out.print("Digite o raio do circulo: ");
        radius = sc.nextDouble();

        area = Circulo.calcularArea(radius);
        circuferenca = Circulo.calcularCirc(radius);

        System.out.printf("Area: %.2f%n", area);
        System.out.printf("Circuferença: %.2f%n", circuferenca);

        sc.close();
    }
}
