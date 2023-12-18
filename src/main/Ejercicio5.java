package main;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Ingrese un numero de 0 a 100 ");
		Scanner entrada= new Scanner(System.in);
		
		int numero= entrada.nextInt();
		
		if(numero>=0 && numero <= 100) {
			System.out.println("esta dentro del rango");
		}
		else {
			System.out.println("esta fuera del rango");
		}

	}

}
