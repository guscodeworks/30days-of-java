package day12;

import java.util.Scanner;

public class MaiorNumero {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a, b, c;

        System.out.println("Digite 3 numeros: ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        int higher = max(a, b, c);

        showResult(higher);

        sc.close();
    }
    
    // Função para a conta do maior numero (sem void é necessario retornar algo)
    public static int max(int x, int y, int z) {

        int aux;
        if (x > y && x > z) {
            aux = x;
        } else if (y > z) {
            aux = y;
        } else {
            aux = z;
        }
        return aux;
    }

    // Esse void significa que nao era retorno de valor
    public static void showResult(int valor) {
        System.out.println("Higher = " + valor);
    }
}