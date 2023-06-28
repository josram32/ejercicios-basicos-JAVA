package ejercicios;

import java.util.Scanner;

import utilizables.Utilizable;

public class ContadorDeCaracteres {

	static Scanner sc = new Scanner(System.in);
	static Utilizable u = new Utilizable();

	public static void main(String[] args) {

		String estado = "Y";

		u.imprimir("Este programa cuenta cuantos caracteres tiene el texto que ud. ingrese\n");
		while (estado.equals("Y")) {

			u.imprimir("Ingrese una palabra o texto: ");
			String texto = sc.nextLine();
			int contador = texto.length();
			if (contador == 0) {
				texto = sc.nextLine();
				contador = texto.length();
			}

			u.imprimir("\nEl texto '" + texto + "' tiene " + contador + " caracteres.");
			u.imprimir("\n");
			estado = u.salir(estado);
			u.imprimir("\n");
		}
		u.imprimir("El programa ha sido finalizado.");

	}

}
