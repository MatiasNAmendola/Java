import java.util.Scanner;

public class EvaluaEdad {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.print("Introduce tu edad por favor: ");
		int edad = entrada.nextInt();
	
		if(edad < 18){
			System.out.println("Tienes "+edad+" y eres adolescente");
		}else if(edad < 40){
			System.out.println("Tienes "+edad+" y eres joven");
		}else if(edad < 65){
			System.out.println("Tienes "+edad+" y eres Maduro");
		}else{
			System.out.println("Cuidate");
		}

	}
}
