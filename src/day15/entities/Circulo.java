package day15.entities;

public class Circulo {
    public static final double PI = 3.14159;

    public static double calcularArea(double radius) {
        return PI * Math.pow(radius, 2);
    }

    public static double calcularCirc(double radius) {
        return 2 * PI * radius;
    }
}
