package com.senati.eti.data;

import com.senati.eti.model.Calculadora1;
import java.util.Scanner;

public class Caso1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
		
		Calculadora1 objcalc = new Calculadora1();
		
		float n1 = 0, n2 = 0;
		
		System.out.println("LECTURA DE NUMEROS");
		System.out.println("*******************");
		System.out.print("Numero 1.......: ");
		n1 = sc.nextFloat();
		System.out.print("Numero 2.......: ");
		n2 = sc.nextFloat();
		
		objcalc.setNumero1 (n1);
		objcalc.setNumero2 (n2);
		
		System.out.println("R E S U L T A D O S ");
		System.out.println("*******************");
		System.out.println("1.- Suma...........: " + objcalc.Suma());
		System.out.println("2.- Resta...........: " + objcalc.Resta());
		System.out.println("3.- Producto........: " + objcalc.Producto());
		
		if(objcalc.getNumero2() != 0) {
			System.out.println("4.- Division..........: " + objcalc.Division());
			System.out.println("4.- Division..........: " + objcalc.RestoEntero());
		}
		else {
			System.out.println("4.- Division..........: No es posible");
			System.out.println("5.- Resto Entero......: No es posible");
			
		}
	

	}

}
