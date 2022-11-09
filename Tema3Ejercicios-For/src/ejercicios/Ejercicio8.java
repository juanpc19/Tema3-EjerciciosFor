package ejercicios;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		
		float numeroIntroducido;//Declaro la variable en la que guardare el numero introducido
		//por el usuario por teclado
		
		int suspenso=0;//Declaro la variable, la inicializo con valor 0 para poder usarla en el bucle 
		//y guardare en ella el valor de suspenso 
		
		//Creo un Scanner, lo llamo dogma y lo importo
		Scanner dogma = new Scanner(System.in);
		
		//Solicito al usuario las 5 calificaciones por mensaje en pantalla
		System.out.println("Introduzca las 5 calificaciones en formato numerico: ");
		
		//Abro bucle, declaro e incializo la variable i dentro del bucle con un valor igual a 1
		
		//Establezo la condicion: variable i menor o igual a 5, 
		//mientras se cumpla se seguira ejecutando el bucle
										
		//Establezco el incremento variable i al que le sumare +1 en cada iteracion,
		//usare esta suma para modificar el valor de i en cada iteracion haciendo que eventualmente
		//la condicion del bucle no se cumpla y finalice el bucle
		for (int i=1; i<=5; i++){
			
		//Asigno el valor introducido por el usuario mediante teclado a variable numeroIntroducido	
		numeroIntroducido = dogma.nextFloat();
		
		//Establezco de condicion que si variable numeroIntroducido menor a 5
		//se ejecute el siguiente bloque de instrucciones
		if (numeroIntroducido<5) {
			
			//Doys valor a variable suspenso igual a 1
			suspenso = 1;
		}
			
			
		}
		
		//Al finalizar el bucle establezo de condicion que si variable suspenso igual a 1 se imprima un mensaje por pantalla
		if (suspenso==1) {
			
			//Imprimo mensaje por pantalla diciendole al usuario que hay al menos un suspenso
			System.out.print("Hay al menos un suspenso");
		}
		
		//Cierro Scanner
		dogma.close();
		
	}

}
