package day11;

public class FormatString {
    public static void main(String[] args) {

        String alfabeto = "abcd EFGh IJK LMOP qrstu vWXyZ     ";

        // Passa a string em letra minuscula
        String s01 = alfabeto.toLowerCase();
        // Passa a string em letra maiusculas
        String s02 = alfabeto.toUpperCase();
        // Remove os espacos da string
        String s03 = alfabeto.trim();
        // Comeca no caractere selecionado, ex: 2 (posicao 2)
        String s04 = alfabeto.substring(2);
        // O segundo argumento define aonde acaba
        String s05 = alfabeto.substring(2, 9);
        // Substitue caracteres ou frases.
        String s06 = alfabeto.replace('a', 'x');
        String s07 = alfabeto.replace("abc", "xtg");
        int i = alfabeto.indexOf("bc");
        int j = alfabeto.lastIndexOf("dg");

        System.out.println("Original: #" + alfabeto + "#");
        System.out.println("LowerCase: #" + s01 + "#");
        System.out.println("UpperCase: #" + s02 + "#");
        System.out.println("trim: #" + s03 + "#");
        System.out.println("substring(2): #" + s04 + "#");
        System.out.println("substring(2, 9): #" + s05 + "#");
        System.out.println("replace('a', 'x'): #" + s06 + "#");
        System.out.println("replace('abc', 'xtg'): #" + s07 + "#");
        System.out.println("Index of 'bc': " + i);
        System.out.println("Last Index of 'dg': " + j);
    }
}
