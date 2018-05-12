import java.util.Scanner;

public class EntradaDatos {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		System.out.print("Introduce tu nombre: ");
		String nombre_usuario = entrada.nextLine();
		System.out.print("Ingresa tu edad: ");
		int edad_usuario = entrada.nextInt();
		System.out.println("Bienvenido "+nombre_usuario+ "\nTu edad es: "+edad_usuario);

	}

}
