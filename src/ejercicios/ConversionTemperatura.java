package ejercicios;

import java.util.Scanner;

import utilizables.Utilizable;

public class ConversionTemperatura {
	
	static Scanner sc = new Scanner(System.in);
	static Utilizable u = new Utilizable();
	
	public static void main (String[] args) {
		
		String estado = "Y";
		u.imprimir("Hola, este programa convierte grados Celsius(°C) a Fahrenheit(°F)\n");
		while(estado.equals("Y")) {
			u.imprimir("Ingrese los grados a convertir: ");
			double gradosCelsius = sc.nextDouble();
			double gradosFahrenheit = (gradosCelsius*1.8)+32;
			u.imprimir(gradosCelsius + "°C son equivalentes a " + gradosFahrenheit +"°F");
						
			u.imprimir("\n");
			estado=u.salir(estado);
			u.imprimir("\n");
		}
		u.imprimir("El programa ha finalizado");
	}
}
