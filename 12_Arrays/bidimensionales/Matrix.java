package arrays.bidimensionales;

public class Matrix {

    private double[][] matriz;

    /**
     * Nueva matriz.
     *
     * @param longitudHorizontal
     * @param longitudVertical
     */
    public Matrix(int longitudHorizontal, int longitudVertical) {
        this.matriz = new double[longitudHorizontal][longitudVertical];
    }

    /**
     * Constructor. Creamos una matriz de ejemplo.
     */
    public Matrix() {
        this.matriz = new double[][]{{1, 2}, {3, 4}, {5, 6}};
    }

    /**
     * Obtener la longitud horizontal.
     *
     * @return
     */
    public int longitudHorizontal() {
        return this.matriz.length;
    }

    /**
     * Obtener la longitud vertical.
     *
     * @return
     */
    public int longitudVertical() {
        if (this.longitudHorizontal() > 0) {
            return this.matriz[0].length;
        } else {
            return 0;
        }
    }

    /**
     * Correr todos los valores de la matriz hacia la derecha.
     */
    public void correrHaciaLaDerecha() {

        // Conservamos las longitudes de los vectores horizontales y los verticales.
        int sizeH = this.longitudHorizontal();
        int sizeV = this.longitudVertical();

        // Ultima posición del vector horizontal.
        int ultimaPosicionHorizontal = sizeH - 1;

        // 'h' tendrá todas las posiciones horizontales, mientras que 'v' las verticales.
        for (int v = 0; v < sizeV; v++) {

            // Conservamos el ultimo valor para ponerlo en la primera posición de 'h'.
            double conservar = this.matriz[ultimaPosicionHorizontal][v];

            for (int h = ultimaPosicionHorizontal; h > -1; h--) {

                // Si podemos obtener el valor de la posición anterior (mientras que h - 1 no sea -1).
                if (h - 1 > -1) {
                    this.matriz[h][v] = this.matriz[h - 1][v];
                } else {
                    // Al llegar a h = 0, guardamos allí el valor que conservamos.
                    this.matriz[0][v] = conservar;
                }

            }
        }

    }

    /**
     * Correr todos los valores de la matriz hacia la izquierda.
     */
    public void correrHaciaLaIzquierda() {

        // Conservamos las longitudes de los vectores horizontales y los verticales.
        int longitudHorizontal = this.longitudHorizontal();
        int longitudVertical = this.longitudVertical();

        // Ultima posición del vector horizontal.
        int ultimaPosicionHorizontal = longitudHorizontal - 1;

        // 'h' tendrá todas las posiciones horizontales, mientras que 'v' las verticales.
        for (int v = 0; v < longitudVertical; v++) {

            // Conservamos el primer valor para ponerlo en la ultima posición posición de 'h'.
            double conservar = this.matriz[0][v];

            for (int h = 0; h < longitudHorizontal; h++) {

                // Si podemos obtener el valor de la siguiente posición sin pasarnos de la última posición.
                if (h + 1 <= ultimaPosicionHorizontal) {
                    this.matriz[h][v] = this.matriz[h + 1][v];
                } else {
                    // Al llegar a la ultima posición, guardamos allí el valor que conservamos.
                    this.matriz[ultimaPosicionHorizontal][v] = conservar;
                }

            }

        }
    }

    /**
     * Correr todos los valores de la matriz hacia abajo.
     */
    public void correrHaciaAbajo() {

        // Conservamos las longitudes de los vectores horizontales y los verticales.
        int longitudHorizontal = this.longitudHorizontal();
        int longitudVertical = this.longitudVertical();

        // Ultima posición del vector vertical.
        int ultimaPosicionVertical = longitudVertical - 1;

        // 'h' tendrá todas las posiciones horizontales, mientras que 'v' las verticales.
        for (int h = 0; h < longitudHorizontal; h++) {

            // Conservamos el ultimo valor para ponerlo en la primera posición de 'v'.
            double conservar = this.matriz[h][ultimaPosicionVertical];

            for (int v = ultimaPosicionVertical; v > -1; v--) {

                // Si podemos obtener el valor de la posición anterior (mientras que v - 1 no sea -1).
                if (v - 1 > -1) {
                    this.matriz[h][v] = this.matriz[h][v - 1];
                } else {
                    // Al llegar a v = 0, guardamos allí el valor que conservamos.
                    this.matriz[h][0] = conservar;
                }
            }
        }

    }

    /**
     * Correr todos los valores de la matriz hacia arriba.
     */
    public void correrHaciaArriba() {

        // Conservamos las longitudes de los vectores horizontales y los verticales.
        int longitudHorizontal = this.longitudHorizontal();
        int longitudVertical = this.longitudVertical();

        // Ultima posición del vector vertical.
        int ultimaPosicionVertical = longitudVertical - 1;

        // 'h' tendrá todas las posiciones horizontales, mientras que 'v' las verticales.
        for (int h = 0; h < longitudHorizontal; h++) {

            // Conservamos el primer valor para ponerlo en la ultima posición posición de 'v'.
            double conservar = this.matriz[h][0];

            for (int v = 0; v < longitudVertical; v++) {

                // Si podemos obtener el valor de la siguiente posición sin pasarnos de la última posición.
                if (v + 1 <= ultimaPosicionVertical) {
                    this.matriz[h][v] = this.matriz[h][v + 1];
                } else {
                    // Al llegar a la ultima posición, guardamos allí el valor que conservamos.
                    this.matriz[h][ultimaPosicionVertical] = conservar;
                }
            }
        }
    }

    /**
     * Cambiar a la matriz transpuesta.
     */
    public void transpuesta() {

        // Conservamos las longitudes de los vectores horizontales y los verticales.
        int longitudHorizontal = this.longitudHorizontal();
        int longitudVertical = this.longitudVertical();

        // Creamos una matriz con las longitudes al revéz: lo que era la longitud horizontal ahora es vertical, y la vertical pasa a ser la horizontal.
        double[][] nuevaMatriz = new double[longitudVertical][longitudHorizontal];

        // Recorremos todos los valores de la matriz actual para guardarlos en la nueva matriz con 'h' como 'v' y 'v' como 'h'.
        for (int h = 0; h < longitudHorizontal; h++) {
            for (int v = 0; v < longitudVertical; v++) {
                nuevaMatriz[v][h] = this.matriz[h][v];
            }
        }

        // Reemplazamos la matriz original por la nueva transpuesta.
        this.matriz = nuevaMatriz;

    }

    /**
     * ¿Es diagonal?
     *
     * @return
     */
    public boolean esDiagonal() {
        // Comienza proceso de suma para verificar si la matriz es diagonal
        int suma = 0;

        for (int h = 0; h < this.matriz.length; h++) {
            for (int v = 0; v < this.matriz[h].length; v++) {
                // Saltamos las posiciones de la diagonal, estas posiciones no necesitan ser sumadas

                if (!(h == v)) {
                    suma += this.matriz[h][v];
                }

                if (suma > 0) {
                    break;
                }
            }

            if (suma > 0) {
                break;
            }
        }

        if (suma == 0) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * ¿Es identidad?
     *
     * @return
     */
    public boolean esIdentidad() {

        // Conservamos las longitudes de los vectores horizontales y los verticales.
        int longitudHorizontal = this.longitudHorizontal();
        int longitudVertical = this.longitudVertical();

        int suma = 0;
        double numeroDiagonal = 0;

        for (int h = 0; h < longitudHorizontal; h++) {
            for (int v = 0; v < longitudVertical; v++) {
                // Saltamos las posiciones de la diagonal, estas posiciones no necesitan ser sumadas

                if (!(h == v)) {
                    suma += this.matriz[h][v];
                } else {
                    if (this.matriz[h][v] != 1) {
                        numeroDiagonal = this.matriz[h][v];
                    }
                }

                if (suma > 0 || numeroDiagonal != 1) {
                    break;
                }
            }

            if (suma > 0 || numeroDiagonal != 1) {
                break;
            }
        }

        if (suma == 0 && numeroDiagonal == 1) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * ¿Es simétrica?
     *
     * @return
     */
    public boolean esSimetrica() {

        // Conservamos las longitudes de los vectores horizontales y los verticales.
        int longitudHorizontal = this.longitudHorizontal();
        int longitudVertical = this.longitudVertical();

        if (longitudHorizontal != longitudVertical) {
            return false;
        }

        boolean cumple = true;

        for (int h = 0; h < longitudHorizontal; h++) {
            for (int v = 0; v < longitudVertical; v++) {
                if (this.matriz[h][v] != this.matriz[v][h]) {
                    cumple = false;
                    break;
                }
            }

            if (cumple == false) {
                break;
            }
        }

        return cumple;

    }
}
