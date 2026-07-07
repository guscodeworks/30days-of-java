package day9;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int soma = 0;
        for (int i = 1; i <= 5; i++) {
            System.out.print("Digite o " + i + "° número: ");
            int x = sc.nextInt();
            soma += x;
        }
        System.out.println("Soma total: " + soma);

        sc.close();
    }
}
