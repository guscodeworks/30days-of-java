package day13;

import day13.entities.Products;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        Products product = new Products();

        System.out.println("Insira os valores do produto: ");
        System.out.print("Nome: ");
        product.name = sc.nextLine();
        System.out.print("Preco: ");
        product.price = sc.nextDouble();
        System.out.print("Quantidade no estoque: ");
        product.quantity = sc.nextInt();

        System.out.println();
        System.out.println("Dados do produto: " + product);

        System.out.println();
        System.out.print("Digite a quantidade que deseja adicionar: ");
        int quantity = sc.nextInt();
        product.addProducts(quantity);

        System.out.println();
        System.out.println("Dados do produto: " + product);

        System.out.println();
        System.out.print("Digite a quantidade que deseja remover: ");
        quantity = sc.nextInt();
        product.removeProducts(quantity);

        System.out.println();
        System.out.println("Dados do produto: " + product);

        sc.close();
    }
}
