package main;

import java.time.LocalDate;
import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.print("Ingrese su año de nacimiento y le mostrare su edad ");
		Scanner entrada= new Scanner(System.in);
		
		int añoNacimiento= entrada.nextInt();
		int edad=0;
		LocalDate añoActual = LocalDate.now();
		
		if(añoNacimiento<2023) {
			edad= añoActual.getYear()-añoNacimiento;
			System.out.print("Tu edad es " + edad );
			
		}
		else {
			System.out.print("No has nacido aun" );
		}

	}

}
