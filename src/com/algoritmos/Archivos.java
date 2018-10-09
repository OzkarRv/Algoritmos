package com.algoritmos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Archivos {

	/*public String leer(String Ubicacion) {
		
		String texto = "";
		
		try {
			File archivo = new File(Ubicacion);
			FileReader filereader = new FileReader (archivo);
			BufferedReader buffer = new BufferedReader(filereader);
			String temp;
			while ((temp=buffer.readLine())!=null)
				texto += temp+"\n";
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return texto;
	
		
	}
	public void escribir(String ubicacion, String contenido) {
		
	try{
			FileWriter archivo = new FileWriter(ubicacion);
			PrintWriter writer = new PrintWriter(archivo);
			writer.print(contenido);
			writer.close();
		}catch (IOException e) {
			e.printStackTrace();
		}
		}*/
	
	
	
	
public String remplazarvocal(String Ubicacion) {
		
		String texto = "";
		String resultado = "";
		
		try {
			File archivo = new File(Ubicacion);
			FileReader filereader = new FileReader (archivo);
			BufferedReader buffer = new BufferedReader(filereader);
			String temp;
			while ((temp=buffer.readLine())!=null)
				texto += temp+"\n";
				resultado = texto.replaceAll("[a|i|o|e|u]", "_");
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return resultado;
	
		
	}
public void minusculas(String ubicacion, String contenido) {
	
	try{
			FileWriter archivo = new FileWriter(ubicacion,true);
			PrintWriter writer = new PrintWriter(archivo);
			writer.print(contenido);
			writer.close();
			
		}catch (IOException e) {
			e.printStackTrace();
		}
		}
	
	
	}
	
		

