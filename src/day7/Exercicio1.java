package day7;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
            System.out.println("\n === Verificador de Números ===");
            System.out.println("Digite um número para verificação: ");
            num = sc.nextInt();
            // Verificação se o número digitado é negativo ou não
            if (num < 0) {
                System.out.println("negativo");
            } else {
                System.out.println("não negativo");
            }
            sc.close();

    }
}
