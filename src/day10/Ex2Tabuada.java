package day10;

import java.util.Scanner;

public class Ex2Tabuada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = 0;
        int digitar;
        
        System.out.println("### Tabuada ###");
        System.out.print("Digite um numero: ");
        digitar = sc.nextInt();

        do {
            System.out.println(digitar + " x " + x + " = " + digitar * x);

            x++;

        } while (x <= 10);

        sc.close();
    }
}
