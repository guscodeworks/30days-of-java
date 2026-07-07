package day9;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double soma = 0;
        System.out.println("\n === Calculador de Média ===");
        for (int i = 1; i <= 4; i++) {
            System.out.print("Digite a " + i + "ª nota: ");
            double nota = sc.nextDouble();
            soma += nota;
        }
        double notaMedia = soma / 4;

        System.out.printf("Sua media foi: %.2f%n", notaMedia);
        System.out.print("Situação: ");

        if (notaMedia >= 5) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }

        sc.close();
    }
}
