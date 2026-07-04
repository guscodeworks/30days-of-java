package day7;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("\n === Verificador Ímpar ou Par ===");
        System.out.print("Digite um número: ");
        num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println(num + " Par");
        } else {
            System.out.println(num + " Ímpar");
        }

        sc.close();
    }
}
