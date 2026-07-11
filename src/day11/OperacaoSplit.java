package day11;

public class OperacaoSplit {
    public static void main(String[] args) {

        String frutas = "Mamão Maçã Laranja";
        // Operacao que separa a string definida por um argumento.
        String[] vetor = frutas.split(" ");

        System.out.println(vetor[0]);
        System.out.println(vetor[1]);
        System.out.println(vetor[2]);
    }
}
