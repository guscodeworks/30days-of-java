package day7;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A, B;

        System.out.println("\n === Verificador de Múltiplos ===");
        System.out.print("Digite o primeiro número: ");
        A = sc.nextInt();
        System.out.print("Digite o segundo número: ");
        B = sc.nextInt();
        // Evitar divisao por 0
        if (A == 0 || B == 0) {
            System.out.println("Inválido, os números não podem ser divididos por 0.");
        } else if (A % B == 0 || B % A == 0) {
            System.out.println("São multiplos");
        } else {
            System.out.println("Não são multiplos");
        }

        sc.close();
    }
}
