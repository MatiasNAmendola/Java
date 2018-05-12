import java.util.Scanner;

public class if1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
    	float sueldo;
    	System.out.print("Ingrese el sueldo: ");
    	sueldo = teclado.nextFloat();
    	if (sueldo>8000) {
    	    System.out.println("Esta persona debe abonar impuestos");
    	} else {
            System.out.println("Esta exento de pagar impuestos");
        }
    }
}
