package com.senati.eti.data;

import com.senati.eti.model.Calculadora2;
import java.util.Scanner;

public class Caso2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		float n1 = 0, n2 = 0;
		
		System.out.println("LECTURA DE NUMEROS");
		System.out.println("*******************");
		System.out.print("Numero 1.......: ");
		n1 = sc.nextFloat();
		System.out.print("Numero 2.......: ");
		n2 = sc.nextFloat();
		
		Calculadora2 objcalc = new Calculadora2(n1, n2);
		
		System.out.println("1.-Suma....: " + objcalc.Calcular(1));
		System.out.println("2.-Resta....: " + objcalc.Calcular(2));
		System.out.println("3.-Producto....: " + objcalc.Calcular(3));
		if(objcalc.getNumero2() != 0) {
			System.out.println("4.- Division..........: " + objcalc.Calcular(4));
			System.out.println("5.- Division..........: " + objcalc.Calcular(5));
		}
		else {
			System.out.println("4.- Division..........: No es posible");
			System.out.println("5.- Resto Entero......: No es posible");
			
		}
		
		System.out.println("6.- Promedio........: " + objcalc.Calcular(6)) ;
		System.out.println("7.- Suma de cuadrados....: " + objcalc.Calcular(7));
		System.out.println("8.- Diferencia porcentual..: " + objcalc.Calcular(8));
		
		if (objcalc.getNumero1() > objcalc.getNumero2()) {
			System.out.println("EL primero numero es el mayor");
		}else
			System.out.println("El segundo numero es el mayor");

	}

}
