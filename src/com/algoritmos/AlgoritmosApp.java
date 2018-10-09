package com.algoritmos;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Random;
import java.util.Scanner;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;

import javax.print.DocFlavor.STRING;

import javafx.scene.layout.Priority;

public class AlgoritmosApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		int base = 0;
		int exp = 0;
		
		Ciclos ciclo = new Ciclos ();
		
		Condicionales condicion = new Condicionales();
		
		//int Asistencia;
		//int Calificacion;
		
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
	
				
		       // int numero;
		     /*   sc = new Scanner(System.in);
		        System.out.print("Introduce un número para invertir: ");
		        numero= sc.nextInt();
		        sc.close();
		        System.out.printf("El número invertido es el: "+condicion.invertirNumero(numero));
		    
		     System.out.println();*/
		   
		       /* System.out.print("Introduce un número para invertir ");
		        numero= sc.nextInt();
		        System.out.println("El numero ingresado es\n"+condicion.esPrimo(numero));*/
		        
		     //  System.out.println(Arreglos.hola());
		        
		/*Arreglos arreglo = new Arreglos();
		        Random rnd = new Random(System.nanoTime());
		        int[]Aleatorio = new int[12];
		        String[]meses = new String[12];
		        
		        for (int i=0; i<Aleatorio.length; i++)
		        	Aleatorio[i] = rnd.nextInt(12);
		        
		        meses = arreglo.Mes(Aleatorio);
		        for(String temp: meses)
		        {
		        	System.out.println(temp);
		        }
		        for(int num:Aleatorio)
		        {
		        	System.out.println(num);
		        }*/
		
		        
		  //      Ramdom rnd = new Ramdom(System.nanoTime());
		      /*  System.out.println("De aque tamaño seria el arreglo");
		        int n1 = sc.nextInt();
		        int [] resp = new int[n1];
		        int[] ramdom1 = new int[n1];
		        int[] ramdom2 = new int[n1];
		        
		        for(int i=0; i<n1; i++)
		        {
		        	ramdom1[i]= rnd.nextInt(100);
		        	ramdom2[i]= rnd.nextInt(100);
		        
		        }
		        
		        resp = arreglo.LlenarA(ramdom1, ramdom2);
		        
		        for( int i=0; i<n1; i++)
		        {
		        	System.out.println(ramdom1[i]+"+"+ramdom2[i]+"="+resp[i]);
		        }*/
		        
		    /*    ArrayList List = new ArrayList();
		        List.add("Ulises");
		        List.add(128);
		        List.add(true);
		        List.add('t');
		        List.add(condicion);
		        
		        List.remove(4);
		        
		        System.out.println("La Lista Contiene Ulises?"+List.contains("Ulises"));
		        System.out.println("La lista Contiene Axel"+List.contains("Axel"));
		        Iterator it = List.iterator();
		        while(it.hasNext())
		        {
		        	System.out.println(it.next());
		        }
		        System.out.println("El Tamaño Actual de la lista :"+List.size());*/
		
		
		/*//Pilas
		Stack<String> pila = new Stack<String>();
		pila.push("Yo");
		pila.push("Oscar");
		pila.push("Romero");
		pila.push("Valadez");
		
		System.out.println("El tamaño es :\n"+pila.size());
		System.out.println("Ultimo elemento Es:\n"+pila.peek());
		System.out.println("El tamaño es "+pila.size());
		System.out.println("El tulimo elemento despues de peek :\n"+pila.pop());
		System.out.println("El Tamaño\n"+pila.size());
		System.out.println("El ultimo  elemento despues de pop :\n"+pila.peek());
		System.out.println("El indice 1"+pila.get(1));
		while(pila.size()>0)
			System.out.println(pila.pop());
		
		pila.size(); //tamaño de la lista 
		pila.pop();  // regresa el elemento de la cima pero lo quita
		pila.size(); // mmuestra tamaño
		pila.peek(); //muestra el ultimo elemento y no lo borra*/
		
				
		
		/*//Colas
		 PriorityQueue<String> cola = new PriorityQueue<String>();
		 cola.add("Ulises");
		 cola.add("Oscar");
		 cola.add("Miguel");
		 cola.add("Antonio");
		 
		 Iterator it = cola.iterator();
		 while(it.hasNext())
		 System.out.println(it.next());
		 System.out.println("El primero\n"+cola.peek());
		 System.out.println("El primero\n"+cola.poll());
		 System.out.println("El nuevo primero:\n"+cola.peek());
		 System.out.println("Contiene Antonio?\n"+cola.contains("Antonio"));
		 System.out.println("Contiene Manu?\n"+cola.contains("Manu"));
		 cola.remove("Antonio");*/
		
		 
		 //TreeSet no puede llevar el mismo tipo de dato
		 /*TreeSet<String> arbol = new TreeSet<String>();
		 arbol.add("Mario");
		 arbol.add("Cesar");
		 arbol.add("Mario");
		 arbol.add("Cesar");
		 
		 System.out.println("Elementos del Arbol\n"+arbol.size());
		 Iterator it = arbol.iterator();
		 while(it.hasNext())
		 System.out.println(it.next());
		 System.out.println("Se agrego Elementos"+arbol.add("Marco"));
		 System.out.println("Se agrego Elementos"+arbol.add("cesar"));
		 System.out.println("Elementos del Arbol\n"+arbol.size());
		 //Quita elemento
		 arbol.remove("Marco");
		 System.out.println("Elementos del Arbol\n"+arbol.size());
		 //quita todos los elemtos 
		 arbol.clear();*/
		
		
		//HashTable. Contiene Claves Para Cada una de sus entradas. No se pueden repetir 
			
		/*Hashtable <Integer, String> hash = new Hashtable<Integer, String>();
		//se define el tipo de dato la clave y el valor
		hash.put(1, "Oscar");
		hash.put(2, "Araceli");
		hash.put(2, "Manu");
		//Se  recorre con enumeration en lugar de iterator
		Enumeration en = hash.keys();
		while(en.hasMoreElements()) {
			int clave = (int) en.nextElement();
				System.out.println(clave+" - "+hash.get(clave));
				
				hash.put(5, "Agustin");
				hash.put(3, "Manuel");	
		//Podemos comprobar  si nuestra hashtable ya contiene una clave con:
		System.out.println("Ya existe la clave 3?"+hash.containsKey(3));
		System.out.println("Ya existe la clave 3?"+hash.containsKey(4));
		
		}*/
		
		//TreeMap Incluye una clave por cada valor , y se ordena  automaticamente de acuerdo a laSTRINGes  
		
			/*TreeMap<String, Integer> tmap = new TreeMap<>();
			tmap.put("Michelle", 90);
			tmap.put("Oscar", 95);
			tmap.put("Alan", 91);
			tmap.put("Yareli", 89);
		
			Iterator it = tmap.keySet().iterator();
			while(it.hasNext()) {
				String clave = (String) it.next();
				System.out.println(clave+"---"+tmap.get(clave));
				
			}
			tmap.remove("Yareli");*/
			
			
			
		Archivos archivo = new Archivos();
		String Lorem = "";
		
		Lorem = archivo.remplazarvocal("C:\\Users\\OscarRv\\Desktop\\Archivo.txt");
		System.out.println(Lorem);
		 
		
		 archivo.minusculas("C:\\Users\\OscarRv\\Desktop\\NuevoArchivo.txt",Lorem);
		 
			}
	
		
			}
		
	
	
	
	
	

