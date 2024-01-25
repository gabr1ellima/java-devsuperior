package application;

import java.util.Scanner;

import entities.Rectangle;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com a largura e altura do retangulo: ");
		
		double width = sc.nextDouble();
		double heigth = sc.nextDouble();
		
		System.out.printf("AREA = %.2f%n", Rectangle.area(width, heigth));
		System.out.printf("PERIMETRO = %.2f%n", Rectangle.perimeter(width, heigth));
		System.out.printf("DIAGONAL = %.2f", Rectangle.diagonal(width, heigth));
		
		sc.close();

	}

}
