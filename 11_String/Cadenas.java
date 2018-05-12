
public class Cadenas {
	public static void main(String[] args) {
		String nombre_usuario = "matias";
		String nombre_usuario_prueba = "Matias";
		
		/* Probando algunos metodos de la clase string. */
		System.out.println("Variable nombre_usuario="+nombre_usuario+" Variable nombre_usuario_prueba="+nombre_usuario_prueba);
		System.out.println("\t Método length: "+nombre_usuario.length());
		System.out.println("\t Método chartAt: "+nombre_usuario.charAt(3));
		System.out.println("\t Método substring: "+nombre_usuario.substring(1, 4));
		System.out.println("\t Método equals: "+nombre_usuario.equals(nombre_usuario_prueba));
		System.out.println("\t Método equalsIgnoreCase: "+nombre_usuario.equalsIgnoreCase(nombre_usuario_prueba));
	}

}
