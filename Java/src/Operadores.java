
public class Operadores {
	public static void main(String[] args) {
		//Operadores aritmeticos
		//  +  -  /  *  %
		int a = 10;
		int b = 20;
		double c = 30.0;
		
		System.out.println("El numero a es: " + a);
		System.out.println("El numero b es: " + b);
		System.out.println("El numero c es: " + c);
		
		int suma = a + b;
		//System.out.println(suma);
		
		String strl = "El resultado de la suma (a+b) es: ";
		System.out.println(strl + suma);
		
		//Resta
		System.out.println("El resultado de la resta (b-a) es: " + (b - a));
		
		//Division
		int division = b / a;
		System.out.println("El resultado de la division entre b/a es: " + division);
		
		double division2 = (double) (c / b);
		// No funciona con dos int, debido a que por lo menos uno de los datos debe ser de tipo double, por eso nos da 0.0
		System.out.println("El resultado de la division (c/b) es: " + division2);
		
		//Multiplicacion
		double multi = c * b;
		System.out.println("El resultado de la multiplicacion (c*b) es: " + multi);
		
		
		//modulo
		double modulo = a % c;
		System.out.println("El resultado de modulo (a%c) es: " + modulo);
		
		int modulo2 = a % b;
		System.out.println("El resultado de modulo (a%b) es: " + modulo2);
		
		/*
		 
		 Operadores de asignacion
		 =
		 
		 */
		
		int d = 5, e; //inicializar las variables vacias
		e = 6;
		System.out.println(d + " - " + e);
		
		
		//Operadores de declaracion compuesta
		//   +=   -=   *=   /=   %=  
		//Es una operacion simplificada
		int f = 0, g = 5;
		f += 5;
		// f = f + 5;
		System.out.println(f);
		
		
		//Operadores relacionales
		//  <,   >,   <=,   >=   
		//  ==  igualdad
		//  !=  diferencia
		// El resultado es booleano (true, false)
		
		int h = 15, i = 25;
		String j = "Hola";
		System.out.println(h > i);  //false
		System.out.println(i != h);  //true
		//System.out.println(h != j);  // ERROR porque el tipo de dato es distinto
		
		
		// Operador unario
		//  ++   --
		// preasignacion   ++k  se le asigna un valor antes de usarse
		// postasignacion  k++  primero lee el valor y despues le suma 1
		
		int k = 0, l = 0;
		k++;
		System.out.println(k);
		System.out.println(--l);
		
		
		//Precedencia de operadores
		int operacion = 4 + 5 * 6 / 3;
		//  5*6 = 30 / 3= 10 + 4 = 14
		System.out.println(operacion);
		
		int x = 0, y = 0;
		int operacion2 = ++x + y--;
		System.out.println(operacion2);
		
		
		
		// Operador ternario
		// Es un if..else abreviado
		// Solo nos permite tomar una decision
		
		int edad = 20, valor1 = 0;
		
		int resultado = (edad <= 18) ? (valor1 = 2) : (valor1 = 3);
		System.out.println(resultado);
		
		//Operadores logicos
		
		// And &&
		// or ||
		// Not !
		System.out.println(true && true); //true
		System.out.println(true && false);
		System.out.println(true || false);
		System.out.println(true && false); 
		
	}
}
