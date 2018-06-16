package ar.edu.ottokrause.psr;

public class Ejercicios {

    /**
     * Ejercicio 1: Escribir un método que, dado un arreglo de enteros, calcule la cantidad de veces que se rompe el
     * orden estrictamente creciente dentro del arreglo.
     *
     * @param arreglo
     * @return
     */
    public static int ejercicio1(int[] arreglo) {
        int cantidad = 0;
        int anterior = 0;

        for (int i = 0; i < arreglo.length; i++) {
            if (i != 0 && arreglo[i] <= anterior) {
                cantidad++;
            }

            anterior = arreglo[i];
        }

        return cantidad;
    }

    /**
     * Ejercicio 2: Escribir un método que, dado un arreglo de objetos Figure, ordene el arreglo de manera ascendente
     * de acuerdo al tamaño del área de cada figura. Las instancias de Figure saben responder el siguiente mensaje:
     * <p>
     * public double area();
     * Devuelve el área de la figura.
     *
     * @param figuras
     */
    public static void ejercicio2(Figure[] figuras) {
        // Se aplicó el método de la burbuja: https://es.wikipedia.org/wiki/Ordenamiento_de_burbuja
        for (int i = 0; i < figuras.length - 1; i++) {
            for (int j = 0; j < figuras.length - i - 1; j++) {
                if (figuras[j + 1].area() < figuras[j].area()) {
                    Figure aux = figuras[j + 1];
                    figuras[j + 1] = figuras[j];
                    figuras[j] = aux;
                }
            }
        }
    }

    /**
     * Correr todos los valores de la matriz hacia la izquierda.
     *
     * Ejercicio 4: Dada la clase Matrix, se pide agregar un método que rote la matriz a la izquierda N veces. Se define
     * rotar la matriz a izquierda como la operación que mueve cada uno de los elementos de la matriz una posición a la
     * izquierda. Las instancias de la clase Matrix saben responder los siguientes mensajes:
     *
     * public int getColumns(); // original: columns();
     * Devuelve la cantidad de columnas de la matriz.
     *
     * public int getRows(); // original: rows();
     * Devuelve la cantidad de filas de la matriz.
     *
     * public double getValue(int row, int column); // original: get(int row, int column);
     * Devuelve el valor que se encuentra en la posición dada por la fila row y columna column.
     *
     * public void setValue(int row, int column, double value); // original: set(int row, int column, double value);
     * Establece el valor que se encuentra en la posición dada por la fila row y columna column, al valor de value.
     *
     * @param a
     * @param n
     */
    public static void ejercicio4(Matrix a, int n) {
        for (int k = 0; k < n; k++) {
            double valorPrevio = a.getValue(0,0);
            double valorActual;

            for (int i = a.getRows() - 1; i >= 0; i--) {
                for (int j = a.getColumns() - 1; j >= 0; j--) {
                    valorActual = a.getValue(i, j);
                    a.setValue(i, j, valorPrevio);
                    valorPrevio = valorActual;
                }
            }
        }
    }
}
