package day14.application;

import day14.entities.Estudante;

import java.util.Locale;
import java.util.Scanner;

public class Program3 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        Estudante estudante = new Estudante();

        System.out.println("### Calculador Trimestral ###");
        System.out.print("Nome: ");
        estudante.name = sc.nextLine();
        System.out.print("Primeira nota: ");
        estudante.nota1 = sc.nextDouble();
        System.out.print("Segunda nota: ");
        estudante.nota2 = sc.nextDouble();
        System.out.print("Terceira nota: ");
        estudante.nota3 = sc.nextDouble();

        System.out.printf("Media final: %.2f%n", estudante.CalcularMediaFinal());

        if (estudante.CalcularMediaFinal() < 60.0) {
            System.out.println("FALHOU!!");
            System.out.printf("Pontos faltantes: %.2f", estudante.PontosFaltantes());
        } else {
            System.out.println("PASSOU!!");
        }

        sc.close();
    }
}
