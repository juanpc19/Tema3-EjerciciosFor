package ejercicios;

public class Ejercicio6 {

	public static void main(String[] args) {

		int sumaImpares=0;//Declaro la variable, la inicializo con valor 0 para poder usarla en el bucle 
		//y guardare en ella el valor de la suma de todos los numeros impares desde 1 a 10
		

		//Abro bucle, declaro e incializo la variable i dentro del bucle con un valor igual a 1
		
		//Establezo la condicion: variable i menor o igual a 10, 
		//mientras se cumpla se seguira ejecutando el bucle
						
		//Establezco el incremento variable i al que le sumare +2 en cada iteracion,
		//usare esta suma para modificar el valor de i en cada iteracion haciendo que eventualmente
		//la condicion del bucle no se cumpla y finalice el bucle
		for (int i=1;  i<=10; i=i+2) {
			
			//Doy valor a variable sumaImpares sumandole el valor de variable i
			sumaImpares+=i;
			
		}
		
		//Al finnalizar el bucle muestro mensaje por pantalla con valor de variable sumaImpares
		System.out.print(sumaImpares);
		
	}

}
