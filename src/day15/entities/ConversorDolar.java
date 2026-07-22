package day15.entities;

public class ConversorDolar {
    public static final double IOF = 0.06;

    public static double dolarParaReal(double contacaoDolar, double quantidadeDolares) {
        return contacaoDolar * quantidadeDolares * (1 + IOF);
    }
}
