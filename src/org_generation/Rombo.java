package org_generation;

public class Rombo implements FiguraGeometrica {
	private String nombre;
	private double Diagonal;
	private double diagonal;
	private double lado;
	


public Rombo(String nombre, double diagonal, double diagonal2, double lado) {
		super();
		this.nombre = nombre;
		Diagonal = diagonal;
		diagonal = diagonal2;
		this.lado = lado;
	}

public double calcularArea() {
	return (Diagonal * diagonal)/2;
}//calcularArea

public double calcularPerimetro() {
	return (lado*4);
}

public String getNombre() {
	return nombre;
}


public void setNombre(String nombre) {
	this.nombre = nombre;
}

public double getDiagonal() {
	return Diagonal;
}

public void setDiagonal(double diagonal) {
	Diagonal = diagonal;
}

public double getDiagonal1() {
	return diagonal;
}

public void setDiagonal1(double diagonal) {
	this.diagonal = diagonal;
}

public double getLado() {
	return lado;
}

public void setLado(double lado) {
	this.lado = lado;
}

@Override
public String toString() {
	return "Rombo [nombre=" + nombre + ", Diagonal=" + Diagonal + ", diagonal=" + diagonal + ", lado=" + lado + "]";
}






}//class rombo