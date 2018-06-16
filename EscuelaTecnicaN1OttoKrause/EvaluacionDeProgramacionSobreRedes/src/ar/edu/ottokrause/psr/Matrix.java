package ar.edu.ottokrause.psr;

public class Matrix {
    private int rows = 0;
    private int columns = 0;
    private double[][] matrix;

    /**
     * Nueva matriz.
     *
     * @param rows
     * @param columns
     */
    public Matrix(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        this.matrix = new double[this.rows][this.columns];
    }

    /**
     * Nueva matriz.
     *
     * @param matrix
     */
    public Matrix(double[][] matrix) {
        this.rows = matrix.length;
        this.columns = matrix[0].length;
        this.matrix = matrix;
    }

    /**
     * Constructor. Creamos una matriz de ejemplo.
     */
    public Matrix() {
        this.rows = 3;
        this.columns = 3;

        this.matrix = new double[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
    }

    public double[][] getMatrix() {
        return matrix;
    }

    /**
     * Devuelve la cantidad de filas de la matriz.
     *
     * @return
     */
    public int getRows() {
        return rows;
    }

    /**
     * Devuelve la cantidad de columnas de la matriz.
     *
     * @return
     */
    public int getColumns() {
        return columns;
    }

    /**
     * Devuelve el valor que se encuentra en la posición dada por la fila row y columna column.
     *
     * @param row
     * @param column
     * @return
     */
    public double getValue(int row, int column) {
        return this.matrix[row][column];
    }

    /**
     * Establece el valor que se encuentra en la posición dada por la fila row y columna column, al valor de value.
     *
     * @param row
     * @param column
     * @param value
     */
    public void setValue(int row, int column, double value) {
        this.matrix[row][column] = value;
    }
}
