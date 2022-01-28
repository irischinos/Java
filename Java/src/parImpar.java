import java.util.Scanner;


public class parImpar {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // permite leer en la consola
		System.out.println("Escribe el número a evaluar: ");
		// declarar variable
		int numero1 = sc.nextInt();
	
		// operador ternario
	String resultado = (numero1 %2 == 0) ? "es Par" : "es Impar";
	System.out.println("El número es: " + resultado);
	}
}