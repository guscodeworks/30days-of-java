package day6;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int pecaUm, pecaDois, numero1, numero2;
        double valorUnitario1, valorUnitario2, valorTotal;

        System.out.println("\n === Valor das Peças ===");
        System.out.print("Codigo da peça 1: ");
        pecaUm = sc.nextInt();
        System.out.print("Quantidade da peça 1: ");
        numero1 = sc.nextInt();
        System.out.print("Valor unitário de cada peça 1: ");
        valorUnitario1 = sc.nextDouble();

        System.out.print("Codigo da peça 2: ");
        pecaDois = sc.nextInt();
        System.out.print("Quantidade da peça 2: ");
        numero2 = sc.nextInt();
        System.out.print("Valor unitário de cada peça 2: ");
        valorUnitario2 = sc.nextDouble();

        valorTotal = numero1 * valorUnitario1 + numero2 * valorUnitario2;

        System.out.printf("Valor total: R$ %.2f%n", valorTotal);

        sc.close();
    }
}
