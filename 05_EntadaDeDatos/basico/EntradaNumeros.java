import javax.swing.JOptionPane;

public class EntradaNumeros {

	public static void main(String[] args) {
		//double x = 10000.0;
		//System.out.printf("%1.2f \n",x/3);
		
		String numero_uno = JOptionPane.showInputDialog("Ingresa unnúmero: ");
		double numero_dos = Double.parseDouble(numero_uno);
		System.out.print("La raiz cuadrada de "+numero_dos+" es ");
		System.out.printf("%1.2f", Math.sqrt(numero_dos));
	}

}
