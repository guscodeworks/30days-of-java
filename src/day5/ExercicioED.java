package day5;

import java.util.Scanner;

public class ExercicioED {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nomeProduto;
        double preco, desconto, totalSemDesconto, valorDesconto, totalComDesconto;
        int quantidade;

        // Entrada de dados
        System.out.println("\n --- Registro de Produtos ---");
        System.out.println("Nome do produto:");
        nomeProduto = sc.nextLine();
        System.out.println("Preço do produto: ");
        preco = sc.nextDouble();
        System.out.println("Quantidade em estoque: ");
        quantidade = sc.nextInt();
        System.out.println("Porcentagem de desconto: ");
        desconto = sc.nextDouble();

        // Cáculo dos descontos
        totalSemDesconto = preco * quantidade;
        valorDesconto = totalSemDesconto * desconto / 100;
        totalComDesconto = totalSemDesconto - valorDesconto;

        // Saida de Dados com o cáuculo
        System.out.println("\n --- Produto Cadastrado ---");
        System.out.printf("Produto: %s%n", nomeProduto);
        System.out.printf("Preço unitário: R$ %.2f%n", preco);
        System.out.printf("Quantidade: %d%n", quantidade);
        System.out.printf("Total sem desconto: R$ %.2f%n", totalSemDesconto);
        System.out.printf("Desconto: R$ %.2f%n", valorDesconto);
        System.out.printf("Total com desconto: R$ %.2f%n", totalComDesconto);

            if (totalComDesconto >= 500) {
            System.out.println("Tipo de compra: compra grande.");
            } else {
            System.out.println("Tipo de compra: compra comum.");
            }

        sc.close();
    }
}
