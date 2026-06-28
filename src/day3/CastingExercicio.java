package day3;

public class CastingExercicio {
    public static void main(String[] args) {
        double nota;
        int notaConvertida;
        nota = 8.7;
        notaConvertida = (int) nota;
        System.out.println("Sua nota em numero inteiro sera: " + notaConvertida + "\nE a original é:  " + nota);

        System.out.println();

        int idade;
        double idadeConvertida;
        idade = 17;
        idadeConvertida = idade; //Aqui ele ja faz automaticamente o casting

        System.out.println("Sua idade e: " + idade);
        System.out.println("Convertida em decimal ficaria: " + idadeConvertida);


    }
}
