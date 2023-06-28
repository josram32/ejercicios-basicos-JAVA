package ejercicios;

import java.util.Random;
import java.util.Scanner;

import utilizables.Utilizable;

public class AdivinaElNumero {
	
	static Scanner sc = new Scanner(System.in);
	static Utilizable u = new Utilizable();
	static Random random = new Random();
	
	public static void main(String[] args) {
				
		String estado = "Y";
		
		u.imprimir("Este es un juego de adivinación\n"
				   + "Adivine el número X generado por el sistema\n");
		u.imprimir("Reglas:\n" 
				   + "1.Tiene 3 intentos\n" 
				   + "2.En cada intento se le darán pistas sobre el número\n"
				   + "3.A menor cantidad de intentos mayor será su puntuación\n"
				   + "4.Despues de 3 intentos fallidos pierde\n");
		u.imprimir("Puede vencer al sistema? Buena Suerte!!! \n");
		
		
		while(estado.equals("Y")) {
			int numeroX = random.nextInt(10) + 1;; //Gneeamos un numero aleatorio entre 1 y 20
			int puntos = 100;
			boolean ganador = false; // el estado del ganador si es true ganó pero si es false está perdiendo
			
			u.imprimir("Iniciamos!!!\n");
			
			//Inicia el bucle cada ciclo es un intento para el jugador
			for(int intentos=0;intentos<=3;intentos++) {
				int numero = 0;
				
				//las caciones cambian dependiento del intento 
				switch(intentos) {
				case 0:
					//le damos la pista correspondiente al intento
					pistas(intentos, numeroX);
					numero = sc.nextInt();
					
					//Evaluamos si la respuesta es correcta
					ganador = validarNumero(numero, numeroX, intentos);
										
					//Se ejecutan acciones para determinar si adivinaste o fallaste y te devuekve ek puntaje segun el resultado 
					puntos = resultadoPuntos(intentos, puntos, ganador);		
					
					//si ganador es verdadero finalizamos el ciclo
					if(ganador)
						intentos=4;
					break;
				case 1:
					pistas(intentos, numeroX);
					numero = sc.nextInt();
					
					ganador = validarNumero(numero, numeroX, intentos);
						
					puntos = resultadoPuntos(intentos, puntos, ganador);							
					
					if(ganador)
						intentos=4;
					break;					
				case 2:
					pistas(intentos, numeroX);
					numero = sc.nextInt();
					
					ganador = validarNumero(numero, numeroX, intentos);
					
					puntos = resultadoPuntos(intentos, puntos, ganador);		
					
					if(ganador)
						intentos=4;
					break;
				default:
					
					puntos = resultadoPuntos(intentos, puntos, ganador);
					u.imprimir("El número X era: " + numeroX);
				}
				
			}		
			
			u.imprimir("\n");
			u.imprimir("¿Quieres jugar otra vez? Y/N");
			estado = sc.next().toUpperCase();
			while (!estado.matches("[YN]")) {
				u.imprimir("Opción invalida\n");
				u.imprimir("¿Desea continuar? Y/N");
				estado = sc.next().toUpperCase();
			}
			u.imprimir("\n");
		}
		u.imprimir("El juego terminó, hasta la próxima.");	

	}
	
	//metodos
	
	public static boolean validarNumero(int numero, int numerox, int intentos) {
		if(numero != numerox) {
			u.imprimir("Fallaste!!! te quedan " + (2-intentos) + " intentos\n");
			return false;
		}
		else {
			u.imprimir("Adivinaste!!! Has vencido al sistema!!!");
			return true;
		}	
		
	}
	
	public static void pistas(int intentos, int numerox) {

		switch(intentos){
		case 0:
			u.imprimir("Cual es el número X???");
			u.imprimir("Pista 1: El número X está entre 1 y 10");
			break;
		case 1: 
			u.imprimir("Cual es el número X???");
			if(numerox>=6)
				u.imprimir("Pista 2: El número X es mayor ó igual a 6");
			else
				u.imprimir("Pista 2: El número X es menor a 6");
			break;
		default: 
			u.imprimir("Cual es el número X???");
			if(numerox%2==0)
				u.imprimir("Pista 3: El número X es par");
			else
				u.imprimir("Pista 3: El número X es impar");
			break;
		}
	}
	
	public static int resultadoPuntos(int intentos, int puntos, boolean ganador) {
		switch(intentos) {
		case 0:						
			if(ganador) {
				u.imprimir("Obtuviste "+ puntos +" puntos perfectos!!!!");
			}
			else {
				puntos -= 40;
			}			
			break;
		case 1:			
			if(ganador) {
				u.imprimir("Obtuviste "+ puntos +" puntos.");
			}
			else {
				puntos -= 40;
			}					
			break;
			
		case 2:
			if(ganador) {
				u.imprimir("Obtuviste "+ puntos +" puntos.");
			}
			else {
				puntos = 0;
			}
			break;
		default:
			if(!ganador && puntos == 0) {
				puntos = 0;
				u.imprimir("Perdiste!!!! Tienes " + puntos +" puntos. (TnT)");
			}
		}
		
		return puntos;
	}

}
