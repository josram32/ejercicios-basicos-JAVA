package utilizables;

import java.util.Scanner;

public class Utilizable {
	
	Scanner sc = new Scanner(System.in);
	
	//metodo imprimir
	public void imprimir(String mensaje) {
		System.out.println(mensaje);
	}
	
	//metodo para finalizar el programa
	public String salir(String estado) {
		imprimir("¿Desea continuar? Y/N");
		estado = sc.next().toUpperCase();
		while (!estado.matches("[YN]")) {
			imprimir("Opción invalida\n");
			imprimir("¿Desea continuar? Y/N");
			estado = sc.next().toUpperCase();
		}
		return estado;
	}
}
