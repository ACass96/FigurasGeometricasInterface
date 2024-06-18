package org_generation;

public class Main {

	public static void main(String[] args) {
		Triangulo bermudas = new Triangulo("Bermudas", 20, 10, 15);
		Triangulo T = new Triangulo("TrianguloTE", 250, 175, 145);
		Cuadrado Bob = new Cuadrado("Bob", 200);
		imprimirCalculo(bermudas);
		imprimirCalculo(T);
		imprimirCalculo(Bob);
	}//main

	public static void imprimirCalculo(FiguraGeometrica f) {
		System.out.println(f.toString());
		System.out.println("+==============================");
		System.out.println("|El área de ["+ f.getNombre() +"] es : "+f.calcularArea());
		System.out.println("|El perímetro de ["+ f.getNombre()+"] es : "+ f.calcularPerimetro());
		System.out.println("+==============================");
	}
}//class main
