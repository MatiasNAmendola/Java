package ar.edu.ottokrause.psr;

public class Cuadrado implements Figure {

    private double lado = 0;

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double area() {
        return lado * lado;
    }
}
