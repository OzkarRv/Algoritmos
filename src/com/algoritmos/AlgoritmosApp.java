package com.algoritmos;

import java.util.Scanner;

public class AlgoritmosApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		int base = 0;
		int exp = 0;
		
		Ciclos ciclo = new Ciclos ();
		
		Condicionales condicion = new Condicionales();
		
		int Asistencia;
		int Calificacion;
		
		/*System.out.println("Dame La Base");
		base = sc.nextInt();
		System.out.println("Dame La exponente");
		exp = sc.nextInt();
		System.out.println(" El resultado es "+ciclo.potencia(base,exp));*/
		
		
		/*System.out.println(" Cual es Tu calificacion");
		Calificacion = sc.nextInt();
		System.out.println("Cuantas Asistencias Tienes?");
		Asistencia = sc.nextInt();
		System.out.println("pasaste\n"+condicion.Acreditar(Asistencia,Calificacion));*/

		
		/*double horas;
		double pagoTotal;
		
		System.out.println("Cuanto Ganas");
		horas = sc.nextDouble();
		System.out.println("Tienes Horas Extras");
		pagoTotal = sc.nextDouble();
		System.out.println("tu pago final es "+condicion.Salario(pagoTotal, horas));*/
		
		/*int n1;
		int n2;
		int n3;
		
		System.out.println("ingresa numero1");
		n1 = sc.nextInt();
		System.out.println("ingresa numero2");
		n2 = sc.nextInt();
		System.out.println("ingresa numero3");
		n3 = sc.nextInt();
		System.out.println("El numero de enmedio es \n"+condicion.medio(n1, n2, n3));*/
	
	   
		/*int n1;
		int n2;
		
		System.out.println("Dame la primero cifra");
		n1 = sc.nextInt();
		System.out.println("Dame la segunda cifra");
		n2 = sc.nextInt();
		System.out.println("la Suma De los Dos numero es"+condicion.cifras(n1, n2));*/
	 //pedir al usuario la hora minutos y segundos  devolver segundo a horas 
		
	
		/*nt a,b,Res = 0;
			System.out.println("Dame El primer Numero");
			a= sc.nextInt();
			System.out.println("Dame El Segundo Numero");
			b =sc.nextInt();
		    System.out.println("El Resultado es"+condicion.suma(a, b, Res));*/
	
				
		        int numero;
		     /*   sc = new Scanner(System.in);
		        System.out.print("Introduce un número para invertir: ");
		        numero= sc.nextInt();
		        sc.close();
		        System.out.printf("El número invertido es el: "+condicion.invertirNumero(numero));
		    
		     System.out.println();*/
		   
		        System.out.print("Introduce un número para invertir ");
		        numero= sc.nextInt();
		        System.out.println("El numero ingresado es\n"+condicion.esPrimo(numero));
		    }
		}
	
	
	
	
	

