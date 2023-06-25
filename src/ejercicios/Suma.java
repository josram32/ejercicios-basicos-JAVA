package ejercicios;

import java.util.Scanner;

import utilizables.Utilizable;

/*
 * Suma de dos números: Escribe un programa que tome dos números como entrada y muestre su suma.
*/
public class Suma {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Utilizable u = new Utilizable();
		
		String estado = "Y";
		u.imprimir("Hola, este programa suma números enteros\n");
		while(estado.equals("Y")) {
			u.imprimir("Ingrese el primer número: ");
			int numero1 = sc.nextInt();
			u.imprimir("Ingrese el segundo número: ");
			int numero2 = sc.nextInt();
			int resultado = numero1 + numero2;
			
			u.imprimir("El resultado de la suma de " + numero1 + " + " + numero2 + " es: " + resultado +"\n");
			
			u.imprimir("\n");
			estado=u.salir(u, sc, estado);
			u.imprimir("\n");
		}
		u.imprimir("El programa ha finalizado");		
		
	}	

}
