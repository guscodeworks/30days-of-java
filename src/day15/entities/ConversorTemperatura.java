package day15.entities;

public class ConversorTemperatura {

    public static double converterCelsius(double temp) {
        return (temp * 9 / 5) + 32;
    }

    public static double converterFahrenheit(double temp) {
        return (temp - 32) * 5 / 9;
    }
}
