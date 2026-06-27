package day2;

public class Concatenacao {
    public static void main (String[] args) {
        String nome = "Gustavo";
        System.out.print("Olá " + nome);
        int a = 55;
        int b = 44;

        System.out.println( ", voce tem R$" + a + b + " reias na conta");

        int idade = 24;
        double renda = 4000.0;

        System.out.printf("%s tem %d e ganha R$ %.2f reais por mês", nome, idade, renda);
    }
}
