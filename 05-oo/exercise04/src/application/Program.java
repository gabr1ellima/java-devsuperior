package application;

import java.util.Scanner;
import entities.Rectangle;

public class Program {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Rectangle rect = new Rectangle();

		System.out.println("Entre com a largura e altura do retangulo:");
		
		rect.width = sc.nextDouble();
		rect.height = sc.nextDouble();
		
		System.out.printf("AREA = %.2f%n", rect.area());
		System.out.printf("PERIMETRO = %.2f%n", rect.perimeter());
		System.out.printf("DIAGONAL = %.2f%n", rect.diagonal());
		
		sc.close();
	}
}
