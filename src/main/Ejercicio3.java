package main;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Ingrese un número cualquiera, le diré si es par o impar");
		Scanner entrada= new Scanner(System.in);
		
		int numero= entrada.nextInt();
		
		if(numero%2==0) {
			System.out.println("El numero es par");
		}
		else {
			System.out.println("EL número es impar");
		}
		

	}

}
