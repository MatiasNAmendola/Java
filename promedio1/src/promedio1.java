import java.util.Scanner;

public class promedio1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int cant,i;
        double prom;
        prom = 0.00;
        System.out.print("Ingrese la cantidad de parciales: ");
        cant = teclado.nextInt();
        for(i=0;i<cant;i++){
            System.out.print("Ingrese la nota del parcial "+ (i+1) +": ");
            prom += teclado.nextDouble();
        }
        System.out.println("Su promedio es: " + prom / cant);
            
    }
}
