package day10;

import java.util.Scanner;

public class Ex1Senha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int senha = 1234;
        int digitar;
        System.out.println("### Login na conta ###");

        do {
            System.out.print("Digite sua senha: ");
            digitar = sc.nextInt();
            if (digitar != senha) {
                System.out.println("Senha invalida!!!");
            } else {
                System.out.println("Senha correta!! Acesso liberado.");
            }
        } while (digitar != senha);

        sc.close();
    }
}
