package ejercicios;

import java.util.Scanner;

import utilizables.Utilizable;

//  Factorial de un número: Escribe un programa que calcule el factorial de un número dado..

public class Factorial {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Utilizable u = new Utilizable();
		
		String estado = "Y";
		
		u.imprimir("Este programa calcula el factorial de un número dado\n");
		while(estado.equals("Y")) {
			
			u.imprimir("Ingrese un número entero:");
			int numero = sc.nextInt();
			int resultado = numero;
			for(int i = numero-1 ; i > 0; i--) {
				resultado *= i;
			}
			u.imprimir("El factorial de !" + numero + " es: " + resultado + "\n");
			u.imprimir("¿Desea continuar? Y/N");
			estado=sc.next().toUpperCase();
			u.imprimir("\n");
			
		}
		u.imprimir("El programa ha sido finalizado.");		

	}

}
