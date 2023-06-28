package ejercicios;

import java.util.Scanner;

import utilizables.Utilizable;

//Números primos: Escribe un programa que determine si un número dado es primo o no.

public class NumeroPrimo {
	
	static Scanner sc = new Scanner(System.in);
	static Utilizable u = new Utilizable();

	public static void main(String[] args) {
		
		String estado = "Y";
		
		u.imprimir("Este programa determina si un número es primo o no.\n");

		// Este bucle ejecutara el programa mientras no se ingrese 0
		while (estado.equals("Y")) {
			u.imprimir("\nIngrese un numero");
			int numero = sc.nextInt();
			int contador = 0;
			for (int i = 1; i <= numero; i++) {
				if (numero % i == 0) {
					contador++; // aqui contaremos las veces que los divisbles dan residuo 0
				}
			}
			// Ahora validamos con el contador si el numero es primo o no
			if (contador > 2 || numero == 1) {
				u.imprimir("El número " + numero + " no es primo");
			} else {
				u.imprimir("El número " + numero + " es primo");
			}
			u.imprimir("\n");
			estado=u.salir(estado);
			u.imprimir("\n");
			
		}
		u.imprimir("El programa ha sido finalizado.");
	}
}
