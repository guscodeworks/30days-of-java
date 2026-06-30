package day4;

import java.util.Scanner;

public class EntradaDadosExerc {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        String nome;
        int idade;
        double nota1, nota2, calcularMedia;

        System.out.println("Qual o seu nome ? ");
        nome = sc.nextLine();
        System.out.println("Sua idade ? ");
        idade = sc.nextInt();
        System.out.println("Suas notas do bimestre ? ");
        nota1 = sc.nextDouble();
        nota2 = sc.nextDouble();

        calcularMedia = (nota1 + nota2) / 2;
        System.out.println("\n --- Dados registrados ---");
        System.out.printf("Aluno: %s%nIdade: %d%nMédia: %.1f%nSituação: ", nome, idade, calcularMedia);
            if(calcularMedia >= 6 ) {
                System.out.print("aprovado");
            } else {
                System.out.print("reprovado");
            }
        sc.close();
    }
}
