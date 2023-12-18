package main;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Ingrese un número cualquiera, le diré si es positivo, negativo o cero");
		Scanner entrada= new Scanner(System.in);
		
		int numero = entrada.nextInt();
		
		if(numero>0) {
			System.out.println("El numero es positivo");
		}
		else if(numero<0) {
			System.out.println("El numero es negativo");
			
			
		}
		else {
			System.out.println("El numero es cero");
			
		}
		
	}

}
