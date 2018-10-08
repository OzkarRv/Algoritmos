package com.algoritmos;

public class Condicionales {
	
 public boolean Acreditar(int Asistencia, int Calificacion) {

  	
	 final int  totalAsist = 70;
 	 boolean paso = false;
 	
	 if(Asistencia>=(totalAsist*.8) && Calificacion>= 60)
		 paso = true;
  	
	 return paso;
	 
	}
      public double Salario(double pago, double horas) {
    	  
      double total = 0;
       
      if (horas>40)
      {
    	  double extras = (horas-40)*(pago*1.5);
    	  total= (40*pago)+ extras;
    	  
      }
      else
      {
    	  total = 40*pago;
      }
      
      return total;
      
	  
      }
      public int medio(int n1, int n2, int n3) {
    	   if(n1<n2&&n2>n3||n1<n2&&n1<n3) 
    	   {
    		   return n1;
    		   
    	   } 
    	   
    	   else if(n2>n1&&n2<n3|| n2>n1&&n2<n3)
    	   {
    		   return n2;
    	   }
    	   
    	   else 
    	   {
    		   
    		   return n3;
    	   }
    	   
    	  
      }
      public int cifras(int n1, int n2) {
    	  int cont1 =0;
    	  int cont2 =0;
    	  
    	  if(n1==0)
    		  cont1=1;
    	  
    	  else {
    	  while(n1>=1)
    	  {
    		  n1 = n1/10;
    		  cont1 ++;
    	  }
    	  }
    	  if(n2==0)
    		  cont2 =1;
    	  else {
    		  while (n2>=1){
    			  n2 = n2/10;
    			  cont2++;
    		  }
    			 
    	  }
    			      		  
    	  return cont1 +cont2;
      }
    
      public int Hora(int a, int b, int c, int incremento, int segundosu) {
    	  if (segundosu!=0) {
    		  if(segundosu>59) {
    			  c+=segundosu%60;
    			  segundosu=segundosu/60;
    			  if (b>59)
    			  {
    				  b = b /60;
    				  if(a>59) {
    					  a = a /24;
    				  }
    			  }
    			  
    		  }
    		  
    	  }
    	  String  total = ("Hora"+a+"minutos"+b+"Segundos"+c);
    	  return a;
      }
      
      
      public int suma(int a, int b, int Res) {
    	  
    	  Res = a+b;
    			  
    	  return Res;
      }
      
      
      public static int invertirNumero(int numero){
	        int cifra, inverso = 0;
	        while(numero!=0){
	            cifra = numero%10;
	            inverso = (inverso * 10) + cifra;
	            numero/=10;
	        }
	        return inverso; 
	        
   
}
      public static boolean esPrimo(int numero){
    	  int contador = 2;
    	  boolean primo=true;
    	  if(numero==1)
    	  {  return primo;
    	  }
    	 
    	  while ((primo) && (contador!=numero)){
    	    if (numero % contador == 0)
    	      primo = false;
    	    contador++;
    	  }
    	  return primo;
    	  
    	  
    	  
    	  
    	  
    	  
    	}
      public String Matriz(int numero) 
      {
    	  String m[][]= new String[numero][numero];
    	  for (int i=0; i<numero; i++)
    	  {
    		  for(int j =0; j< numero; j++) {
    			  m[i][j]="*";
    		  }
    		  
    	  }  

    	  return "m";
      }
     
      public int Arreglo(int Arreglo) { 
    	return 0;  
      }
      
      
//      return"";
}


