package ejercicios;

import java.util.Scanner;

import utilizables.Utilizable;

//Números primos: Escribe un programa que determine si un número dado es primo o no.

public class NumeroPrimo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Utilizable u = new Utilizable();

		u.imprimir("Este programa determina si un número es primo o no.\n" + "el 0 finalizará el programa");
		u.imprimir("\nIngrese un numero");
		int numero = sc.nextInt();

		// Este bucle ejecutara el programa mientras no se ingrese 0 ó 1
		while (numero >= 0) {

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

			u.imprimir("\nIngrese un numero");
			numero = sc.nextInt();
		}
		u.imprimir("El programa ha sido finalizado.");
	}
}
