
public class ClaseMath {

	public static void main(String[] args) {
		/*
		 * Ejercicios para aprender a usar la clase
		 * Math.
		 * 
		 * Acontinuación usaremos el metodo sqrt que
		 * devuelve la raiz cuadrada de un numero, 
		 * para ello debemos recibir el resultado en 
		 * una variable tipo double, porque el metodo
		 * nos devuelve un entero, y asi no tener 
		 * errores en la compilación
		 * 
		 * */
		double raiz = Math.sqrt(9.0);
		System.out.println("La raiz cuadrada de nueve es: "+raiz);
		
		/*
		 * Redondeo de un número decimal usando el método de
		 * refundicion. Con evitamos el problema de asignar 
		 * un valor long a una variable de tipo int.
		 *  
		 * */
		double numero_a_redondear_con_refundicion = 5.85;
		int numero_redondeado_con_refundicion = (int)Math.round(numero_a_redondear_con_refundicion);
		System.out.println("El numero a redondear con refunficion es "+numero_a_redondear_con_refundicion+" y su resultado es: "+numero_redondeado_con_refundicion);
		
		/*
		 * Método normal de redondear un número, es recomendable
		 * es recomendable dejarlo como float y poner el sufijo
		 * despues del número. Si quieres un metodo mas preciso 
		 * usa el de mas arriba(Refundición ).
		 * 
		 * */
		float numero_a_redondear = 5.85F;
		int numero_redondeado = Math.round(numero_a_redondear);
		System.out.println("El numero redondeado de "+numero_a_redondear+" es: "+numero_redondeado);
		
		/*
		 * El siguiente metodo a ver de la clase math es pow
		 * nos servira para calcular la potencia de un numero.
		 * 
		 * */
		
		double base = 5;
		double exponente = 3;
		
		int resultado_metodo_pow = (int)Math.pow(base, exponente);
		
		System.out.println("El resultado de la operación "+(int)base+"^"+(int)exponente+" es "+resultado_metodo_pow);
		
	}

}
