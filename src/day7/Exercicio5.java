package day7;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int codigo, quantidade;
        double valor = 0;
        System.out.println("\n === Barraca de comidas ===");
        System.out.println(" -- Opções --");
        System.out.println("1 - Cachorro Quente - R$ 4,00");
        System.out.println("2 - X-Salada - R$ 4,50");
        System.out.println("3 - X-Bacon - R$ 5,00");
        System.out.println("4 - Torrada Simples - R$ 2,00");
        System.out.println("5 - Refrigerante - R$ 1,50\n");
        System.out.print("Digite o codigo do alimento: ");
        codigo = sc.nextInt();
        System.out.print("Quantidade que você quer: ");
        quantidade = sc.nextInt();

        // Fazer uma cadeia de else if nao é recomendado!!
        if (codigo == 1) {
            valor = quantidade * 4.00;
        } else if (codigo == 2) {
            valor = quantidade * 4.50;
        } else if (codigo == 3) {
            valor = quantidade * 5.00;
        } else if (codigo == 4) {
            valor = quantidade * 2.00;
        } else if (codigo == 5) {
            valor = quantidade * 1.50;
        } else {
            System.out.println("Codigo invaldo!!");
        }
        System.out.printf("Total do pedido: R$ %.2f%n", valor);
        sc.close();
    }
}
