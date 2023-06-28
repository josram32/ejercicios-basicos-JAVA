package ejercicios;

import java.util.Scanner;

import utilizables.Utilizable;

public class Calculadora {

	static Scanner sc = new Scanner(System.in);
	static Utilizable u = new Utilizable();

	public static void main(String[] args) {

		String salir = "N";
		u.imprimir("Hola, bienvenido a la calculadora virtual\n");
		u.imprimir("La calculadora resuelve operaciones sencillas con las 4 operaciones básicas\n");
		while (salir.equals("N")) {

			mostrarMenuOperaciones();
			String operacion = sc.next().toUpperCase();
			// Validamos que se elija una de las opciones del menú
			operacion = validarOpcion(operacion);

			switch (operacion) {
			case "1":
				operar("Sumar", " + " );
				break;
			case "2":
				operar("Restar", " - " );
				break;
			case "3":
				operar("Multiplicar", " * " );
				break;
			case "4":
				operar("Dividir", " / " );
				break;
			}

			u.imprimir("\n");
			u.imprimir("¿Desea salir del programa? Y/N");
			salir = sc.next().toUpperCase();
			while (!salir.matches("[YN]")) {
				u.imprimir("Opción invalida\n");
				u.imprimir("¿Desea salir del programa? Y/N");
				salir = sc.next().toUpperCase();
			}
			u.imprimir("\n");
		}
		u.imprimir("El programa ha finalizado");

	}

	static void operar(String operacion, String signo) {
		u.imprimir("Ud eligió " + operacion + " (la tecla X es para salir)\n");
		u.imprimir("Ingrese el primer número"); //ingresamos el primer número de la operación
		String numero1 = sc.next();
		numero1 = validarNumero1(numero1); //validanos que solo ingrese números o salir
		
		//Si numero1 ejecuta la ccion si no se le pide salir
		if (!numero1.matches("[X]")) {
			System.out.print(Double.parseDouble(numero1) + signo);
			String numero2 = sc.next().toUpperCase();

			// Este primer bucle valida que solo se ingresen numeros o la tecla de salida X
			numero2 = validarNumero2(numero2, numero1, signo);

			// Este bucle repite la operación hasta que el usuario decida salir al
			// presionar X
			while (numero2.matches("^(-?\\d+\\.?\\d*)$")) {
				//aqui ejecutara la operacion que se le indique al metodo
				switch(operacion) {
					case "Sumar":
						numero1 =(Double.parseDouble(numero1) + Double.parseDouble(numero2)) + "";
						break;
					case "Restar":
						numero1 =(Double.parseDouble(numero1) - Double.parseDouble(numero2)) + "";
						break;
					case "Multiplicar":
						numero1 =(Double.parseDouble(numero1) * Double.parseDouble(numero2)) + "";
						break;
					default:
						numero1 =(Double.parseDouble(numero1) / Double.parseDouble(numero2)) + "";
				}
				
				System.out.print(numero1 + signo);
				numero2 = sc.next().toUpperCase();
				numero2 = validarNumero2(numero2, numero1, signo);
			}

		}

	}

	

	static String validarNumero1(String numero1) {
		while (!numero1.matches("^(-?\\d+\\.?\\d*|X)$")) {
			u.imprimir("Solo números ó la tecla X para salir");
			numero1 = sc.next().toUpperCase();
		}
		return numero1;
	}

	static String validarNumero2(String numero2, String numero1, String signo) {
		while (!numero2.matches("^(-?\\d+\\.?\\d*|X)$")) {
			u.imprimir("Solo números ó la tecla X para salir");
			System.out.print(Double.parseDouble(numero1) + signo);
			numero2 = sc.next().toUpperCase();
		}
		return numero2;
	}

	static void mostrarMenuOperaciones() {
		u.imprimir("¿Qué operación desea realizar?\n" + "1.Sumar (Presione la tecla 1)\n"
				+ "2.Restar (Presione la tecla 2)\n" + "3.Multiplicar (Presione la tecla 3)\n"
				+ "4.Dividir (Presione la tecla 4)\n" + "5.Salir (Presione la tecla X)\n");
	}

	static String validarOpcion(String operacion) {
		while (!operacion.matches("[1234X]")) {
			u.imprimir("Opción invalida\n");
			mostrarMenuOperaciones();
			operacion = sc.next().toUpperCase();
		}
		return operacion;
	}
}
