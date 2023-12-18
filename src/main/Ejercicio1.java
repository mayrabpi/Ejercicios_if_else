package main;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.print("Ingrese una calificacion de 0 a 100 ");
		Scanner entrada= new Scanner(System.in);
		
		int calificacion=entrada.nextInt();
		
		if(calificacion >=60) {
			System.out.println("Aprovado");
			
			
		}
		else {
			System.out.println("suspensos");
		}


	}

}
