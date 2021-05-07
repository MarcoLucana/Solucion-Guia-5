package com.senati.eti.model;

public class Alumno {
	private String nombre;
	private String apellidos;
	private String genero;
	private int edad ;
	
	public String getNombre() {
		return this.nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return this.apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getGenero() {
		return this.genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public int getEdad() {
		return this.edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;	
		
	}
	
	public Alumno(String nom, String ape, String gen, int edad) {
		this.nombre = nom;
		this.apellidos = ape;
		this.genero = gen;
		this.edad = edad;


		// TODO Auto-generated constructor stub
	}
	public Alumno() {
		// TODO Auto-generated constructor stub
	}
	public String NombreCompleto() {
		return this.nombre + " " + this.apellidos;
	}
	
	public String MostrarGenero() {
		String g = "";
		
		if(this.genero.equals("F"))
			g = "Femenino";
		else if (this.genero.equals("M"))
			g = "Masculino";
		
		return g;
	}
	
	public String MostrarEstado() {
		return (this.edad >=18 ? "Mayor de edad " : "Menor de edad");
	}
	
}
