package day14.entities;

public class Estudante {
    public String name;
    public double nota1;
    public double nota2;
    public double nota3;


    public double CalcularMediaFinal() {
        return nota1 + nota2 + nota3;
    }

    public double PontosFaltantes() {
        if (CalcularMediaFinal() < 60.0) {
            return 60.0 - CalcularMediaFinal();
        } else {
            return 0.0;
        }
    }
}
