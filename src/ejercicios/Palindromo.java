package ejercicios;

import java.util.Scanner;

import utilizables.Utilizable;

//Palíndromo: Escribe un programa que verifique si una cadena de texto es un palíndromo 
//(se lee igual de izquierda a derecha y de derecha a izquierda).
public class Palindromo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Utilizable u = new Utilizable();
		
		String estado = "Y";
		
		u.imprimir("Este programa determina si una palabra es un palíndromo\n");
		
		while(estado.equals("Y")) {
			
			u.imprimir("Ingrese una palabra");
			String palabra = sc.next().toLowerCase();
			String palabraInvertida="";
			
			for(int i=palabra.length()-1;i>=0;i--) {
				palabraInvertida += palabra.charAt(i);
			}
			if(palabra.equals(palabraInvertida)) 
				u.imprimir(palabra+" al reves sería " + palabraInvertida + " asi que si es un palíndromo."); 
			else 
				u.imprimir(palabra+" al reves sería " + palabraInvertida + " asi que no es un palíndromo."); 
			
			u.imprimir("\n");
			estado=u.salir(u, sc, estado);
			u.imprimir("\n");

		}
		u.imprimir("El programa ha sido finalizado.");		

	}

}
