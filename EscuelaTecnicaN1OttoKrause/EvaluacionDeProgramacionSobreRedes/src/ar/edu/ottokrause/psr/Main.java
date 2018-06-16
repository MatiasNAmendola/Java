package ar.edu.ottokrause.psr;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // Ejercicio 1: Escribir un método que, dado un arreglo de enteros, calcule la cantidad de veces que se rompe
        // el orden estrictamente creciente dentro del arreglo.

        int[] arreglo = new int[]{1, 3, 5, 2, 4, 6, 8, 8, 9, 10};

        System.out.println("Arreglo: " + Arrays.toString(arreglo));

        int veces = Ejercicios.ejercicio1(arreglo);

        System.out.println("El número de veces que se rompe el orden es " + veces + ".");

        // Ejercicio 2: Escribir un método que, dado un arreglo de objetos Figure, ordene el arreglo de manera
        // ascendente de acuerdo al tamaño del área de cada figura.

        Figure[] figuras = new Figure[]{
                new Cuadrado(2), new Cuadrado(5), new Cuadrado(3.5), new Cuadrado(2), new Cuadrado(1.5)
        };

        System.out.println("Figuras desordenadas: ");

        for (Figure figura : figuras) {
            System.out.println("Figura 1, area: " + figura.area());
        }

        Ejercicios.ejercicio2(figuras);

        System.out.println("Figuras ordenadas: ");

        for (Figure figura : figuras) {
            System.out.println("Figura 1, area: " + figura.area());
        }

        // Ejercicio 4: Dada la clase Matrix, se pide agregar un método que rote la matriz a la izquierda N veces. Se
        // define rotar la matriz a izquierda como la operación que mueve cada uno de los elementos de la matriz una
        // posición a la izquierda.

        Matrix matriz = new Matrix();

        System.out.println("Matriz con sus valores iniciales: ");

        for (int i = 0; i < matriz.getRows(); i++) {
            System.out.print("[");

            for (int j = 0; j < matriz.getColumns(); j++) {
                System.out.print((j != 0 ? ", " : "") + matriz.getValue(i, j));
            }

            System.out.println("]");
        }

        Ejercicios.ejercicio4(matriz, 2);

        System.out.println("Matriz con sus valores rotados hacia la izquierda 1 vez: ");

        for (int i = 0; i < matriz.getRows(); i++) {
            System.out.print("[");

            for (int j = 0; j < matriz.getColumns(); j++) {
                System.out.print((j != 0 ? ", " : "") + matriz.getValue(i, j));
            }

            System.out.println("]");
        }

    }
}
