// Se importa la librería
import java.util.Scanner;

public class variables2 {
    public static void main(String[] args) {
        /*
         * Creamos el objeto de tipo Scanner con el nombre "teclado"
         */
        Scanner teclado = new Scanner(System.in);
        int num1,num2,suma,producto;
        /*
         * print a diferencia de println no hace un salto de línea
         */
    	System.out.print("Ingrese primer valor: ");
        // La variable num1 recibe el número ingresado por teclado
    	num1 = teclado.nextInt();
    	System.out.print("Ingrese segundo valor: ");
        // La variable num2 recibe el número ingresado por teclado
    	num2 = teclado.nextInt();
    	suma = num1 + num2;
    	producto = num1 * num2;
    	System.out.print("La suma de los dos valores es: ");
    	System.out.println(suma);
    	System.out.print("El producto de los dos valores es: ");
    	System.out.println(producto);
    }
}
