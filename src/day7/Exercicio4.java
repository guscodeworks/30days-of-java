package day7;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int horaInicial, horaFinal, duracao;

        System.out.println("\n === Calculador Duração de Jogo ===");
        System.out.print("Digite a hora inicial: ");
        horaInicial = sc.nextInt();
        System.out.print("Digite a hora final: ");
        horaFinal = sc.nextInt();

        if (horaInicial < horaFinal) {
            duracao = horaFinal - horaInicial;
            System.out.println("O jogo durou: " + duracao + " hora(s)");
        } else {
            duracao = 24 - horaInicial + horaFinal;
            System.out.println("O jogo durou: " + duracao + " hora(s)");
        }

        sc.close();
    }
}
