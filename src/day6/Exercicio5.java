package day6;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double A, B, C, pi, triangulo, circulo, trapezio, quadrado, retangulo;
        pi = 3.14159;

        System.out.println("\n === Calculando Valores ===");
        System.out.print("Valor de A: ");
        A = sc.nextDouble();
        System.out.print("Valor de B: ");
        B = sc.nextDouble();
        System.out.print("Valor de C: ");
        C = sc.nextDouble();

        // Tive bastante dificuldade nas fórmulas
        triangulo = A * C / 2.0;
        circulo = pi * Math.pow(C,2.0);
        trapezio = (A + B) * C / 2.0;
        quadrado = B * B ;
        retangulo = A * B ;

        System.out.printf("TRIAGULO: %.3f%n",triangulo);
        System.out.printf("CIRCULO: %.3f%n", circulo);
        System.out.printf("TRAPÉZIO: %.3f%n", trapezio);
        System.out.printf("QUADRADO: %.3f%n", quadrado);
        System.out.printf("RETANGULO: %.3f%n", retangulo);
        sc.close();
    }
}
