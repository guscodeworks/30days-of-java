package day6;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double pi, raio, soma;
        pi = 3.14159;

        System.out.print("Digite o valor do raio: ");
        raio = sc.nextDouble();

        soma = pi * Math.pow(raio, 2.0);
        System.out.printf("Resultado: %.4f%n", soma);
        sc.close();
    }
}
