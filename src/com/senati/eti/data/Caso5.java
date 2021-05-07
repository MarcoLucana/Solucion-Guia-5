package com.senati.eti.data;
import java.io.*;

public class Caso5 {

	public static void main(String[] args) {
		File archivo = null;
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			archivo = new File ("datos.txt");
			fr = new FileReader(archivo);
			br = new BufferedReader (fr);
			
			System.out.println(String.format("%-20s %-20s %-15s",
					"Nombre y Apellido", "Distrito", "Mes de Nac."));
			System.out.println(String.format("%-20s %-20s %-15s" ,
					"-------------------", "--------", "-----------"));
			
			String linea = "";
		
			
			while((linea = br.readLine()) != null) {
				String [] contenido = linea.split(";");
				
				for(int x = 0; x < contenido.length; x++)
					System.out.print(String.format("%-20s", CambiarTexto(contenido[x])));
				System.out.println();
			}
		} catch (Exception e1) {
			e1.printStackTrace();
		}

	}
	
	public static String CambiarTexto(String cadena) {
		String[]arrPalabra = cadena.split(" ");
		
		String union = "";
		
		for(int x = 0; x < arrPalabra.length; x++)
			union += arrPalabra[x].substring(0,1).toUpperCase() +
			         arrPalabra[x].substring(1) + " ";
		return union;
		
	}

}
