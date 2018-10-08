package com.algoritmos;

public class Arreglos {
	
	public String[] Mes(int []Aleatorio) 
	{
		
		String[] muestra ={"Buen Intento","enero","febrero","marzo","Abril","Mayo","junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};
		
		String [] meses = new String[Aleatorio.length];
		int aux = 0;
		for ( int i =0; i<Aleatorio.length; i++)
		{
			meses[i] = muestra[Aleatorio[i]];
			
		}
		return meses;
	}

	
	public int[] LlenarA(int [] n1, int[] n2) 
	{
		int[]n3 = new int[n1.length];
		
		for(int i=0; i<n1.length; i++)
		{
			n3[i]= n1[i]+n2[i];
		}
		return n3;
		
		
	}
	
	public static void main(String args[]) {
		 	
		int Numeros[] = new int [5];
		
		Numeros[0] =5;
		Numeros[0] =5;
		Numeros[0] =5;
		Numeros[0] =5;
		Numeros[0] =5;
		
	}
	
}
