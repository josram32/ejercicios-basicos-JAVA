package ejercicios;

import java.util.ArrayList;
import java.util.Scanner;

import utilizables.Utilizable;

public class OrdenarArreglo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Utilizable u = new Utilizable();

		String estado = "Y";
		u.imprimir("Hola, este programa recibe unsa serie de 5 números\n"
				+ "Ud. decide si desea que lo ordene ascendente o descendentemente\n");
		while (estado.equals("Y")) {
			ArrayList<Integer> arreglo = new ArrayList<Integer>();

			// Este metodo es para que se ingresen los numeros del arreglo
			crearArreglo(u, sc, arreglo);

			// mostramos el arreglo actual
			imprimirArreglo(arreglo, "actualmente");

			// ordenamos el arreglo
			ordenarArreglo(u, sc, arreglo);
			u.imprimir("\n");
			// validamos si el usuario desea salir del programa o no
			estado=u.salir(u, sc, estado);
			u.imprimir("\n");

		}
		u.imprimir("El programa ha finalizado");

	}
 
	
	public static void crearArreglo(Utilizable u, Scanner sc, ArrayList<Integer> arreglo) {
		// Este bucle es para que se ingresen los numeros del arreglo
		for (int i = 1; i <= 5; i++) {
			if (i < 5) {
				u.imprimir("Ingrese el número " + i);
				int numero = sc.nextInt();
				arreglo.add(numero);
			} else {
				u.imprimir("Ingrese el último número ");
				int numero = sc.nextInt();
				arreglo.add(numero);
			}
		}
	}

	public static void imprimirArreglo(ArrayList<Integer> arreglo, String orden) {
		System.out.println("El arreglo " + orden + " sería");
		for (int numero : arreglo) {
			System.out.print(numero + " ");
		}
	}

	public static void ordenarArreglo(Utilizable u, Scanner sc, ArrayList<Integer> arreglo) {
		// ahora preguntamos como se va ordenar el arreglo
		u.imprimir(
				"\nDesea ordenarlo ascendente o descendente?\n " + "(presione A para ascendente ó D para descendente)");
		String orden = sc.next().toUpperCase();
		u.imprimir(orden);
		// validamos que se elija una opcion válida
		while (!orden.matches("[AD]")) {
			u.imprimir("Opción invalida");
			u.imprimir("\nDesea ordenarlo ascendente o descendente?\n"
					+ "(presione A para ascendente ó D para descendente)");
			orden = sc.next().toUpperCase();
		}
		// ordenamos el arreglo segun la opcion seleccionada
		if (orden.equals("A")) {
			for (int i = 0; i < arreglo.size() - 1; i++) {
				for (int j = 0; j < arreglo.size() - 1; j++) {
					int temporal = arreglo.get(j);
					if (arreglo.get(j) > arreglo.get(j + 1)) {
						temporal = arreglo.get(j);
						arreglo.set(j, arreglo.get(j + 1));
						arreglo.set(j + 1, temporal);
					}
				}
			}
			imprimirArreglo(arreglo, "ascendente");
		} else {
			for (int i = 0; i < arreglo.size() - 1; i++) {
				for (int j = 0; j < arreglo.size() - 1; j++) {
					int temporal = arreglo.get(j);
					if (arreglo.get(j) < arreglo.get(j + 1)) {
						temporal = arreglo.get(j);
						arreglo.set(j, arreglo.get(j + 1));
						arreglo.set(j + 1, temporal);
					}
				}
			}
			imprimirArreglo(arreglo, "descendente");
		}
	}


}
