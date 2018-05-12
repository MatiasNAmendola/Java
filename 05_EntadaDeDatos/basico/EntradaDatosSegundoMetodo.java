import javax.swing.JOptionPane;

public class EntradaDatosSegundoMetodo {

	public static void main(String[] args) {

		String nombre_usuario = JOptionPane.showInputDialog("Introduce tu nombre: ");
		String edad = JOptionPane.showInputDialog("Ingresa tu edad");
		int edad_usuario = Integer.parseInt(edad);
		System.out.println("Tu nombre es: " +nombre_usuario+ "\nTu edad el año que viene sera: "+edad_usuario++);

	}
}
