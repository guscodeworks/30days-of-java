package day6;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A, B, C, D, diferenca;

        System.out.println("\n === Diferença de Números ===");
        System.out.print("Primeiro número:");
        A = sc.nextInt();
        System.out.print("Segundo número: ");
        B = sc.nextInt();
        System.out.print("Terceiro número: ");
        C = sc.nextInt();
        System.out.print("Ultimo número: ");
        D = sc.nextInt();

        diferenca = A * B - C * D;

        System.out.println("A diferença entre eles é: " + diferenca);
        sc.close();
    }
}
