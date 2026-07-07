package day9;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("\n === Tabuada ===");
        System.out.print("Digite um numero: ");
        n = sc.nextInt();

        for (int i = 0; i <= 10; i++) {

            System.out.println(n + " x " + i + " = " + n * i);
        }
        sc.close();
    }
}
