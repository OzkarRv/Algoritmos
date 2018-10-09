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
		 	
		int i=0;
		int Numeros[] = new int [10];
		
		
		Numeros[0] =0;
		Numeros[1] =1;
		Numeros[2] =2;
		Numeros[3] =3;
		Numeros[4] =4;
		Numeros[5] =5;
		Numeros[6] =6;
		Numeros[7] =7;
		Numeros[8] =8;
		Numeros[9] =9;
		
		
		int aux = Numeros[0];
		
		for(i=0; i<Numeros.length-1; i++) {
			Numeros [i] = Numeros[i+1];
			System.out.println(Numeros[i]);
		}
		Numeros[Numeros.length-1]=aux;
		System.out.println(Numeros[i]);
	}
	
}
