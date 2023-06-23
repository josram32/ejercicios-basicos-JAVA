package ejercicios;

import java.util.ArrayList;
import java.util.Scanner;

import utilizables.Utilizable;

//Números Fibonacci: Escribe un programa que genere los primeros N números de la secuencia de Fibonacci.
public class Fibonacci {
	
	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		Utilizable u = new Utilizable();
		
		String estado = "Y";
		
		u.imprimir("Este programa crea una serie Fibonacci hasta el número que se le indique\n");
		while(estado.equals("Y")) {
			
			ArrayList<Integer> secuencia = new ArrayList<Integer>();
			int numero1 = 0;
			int numero2 = 1;
			
			u.imprimir("Ingrese un número");
			int numeroLimite = sc.nextInt();
			for(int i = 0 ; numero1+numero2<=numeroLimite; i++) {
				if(i>=2) {
					secuencia.add(numero1+numero2);
					numero1=numero2;
					numero2=secuencia.get(i);
					System.out.print(secuencia.get(i)+" ");
				}
				else{
					secuencia.add(i);		
					System.out.print(secuencia.get(i)+" ");
				}				
			}			
			
			u.imprimir("\n¿Desea continuar? Y/N");
			estado=sc.next().toUpperCase();
			u.imprimir("\n");
			
		}
		u.imprimir("El programa ha sido finalizado.");	
	}
	
}
