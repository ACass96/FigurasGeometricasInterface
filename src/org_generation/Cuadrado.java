package org_generation;

public class Cuadrado implements FiguraGeometrica {
	private String nombre;
	private double lado;
	
	
	public Cuadrado(String nombre, double lado) {
		super();
		this.nombre = nombre;
		this.lado = lado;
	}//constructor
	
	
	public double calcularArea() {
		return (lado * 4);
	}//calcularArea

	public double calcularPerimetro() {
		return (lado);
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public double getLado() {
		return lado;
	}


	public void setLado(double lado) {
		this.lado = lado;
	}


	@Override
	public String toString() {
		return "Rombo [nombre=" + nombre + ", lado=" + lado + "]";
	}
	
	
}//class Cuadrado
