package utilizables;

import java.util.Scanner;

public class Utilizable {
	
	//metodo imprimir
	public void imprimir(String mensaje) {
		System.out.println(mensaje);
	}
	
	//metodo para finalizar el programa
	public String salir(Utilizable u, Scanner sc, String estado) {
		u.imprimir("¿Desea continuar? Y/N");
		estado = sc.next().toUpperCase();
		while (!estado.matches("[YN]")) {
			u.imprimir("Opción invalida\n");
			u.imprimir("¿Desea continuar? Y/N");
			estado = sc.next().toUpperCase();
		}
		return estado;
	}
}
