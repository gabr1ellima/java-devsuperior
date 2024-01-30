package application;

import java.util.Scanner;

import entities.Bill;

public class Program {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Sexo: ");
		Bill.gender = sc.next().charAt(0);
		
		System.out.print("Quantidade de cervejas: ");
		Bill.beer = sc.nextInt();
		
		System.out.print("Quantidade de refrigerantes: ");
		Bill.softDrink = sc.nextInt();
		
		System.out.print("Quantidades de espetinhos: ");
		Bill.barbecue = sc.nextInt();
		
		System.out.println();
		System.out.println("RELATORIO: ");
		
		if (Bill.cover() == 0) {
			System.out.printf("Consumo = R$ %.2f%n", Bill.feeding());
			System.out.println("Insento de Couvert");
			System.out.printf("Ingresso = R$ %.2f%n", Bill.ticket());
			System.out.printf("%nValor a pagar = R$ %.2f%n", Bill.total());
		} else {
			System.out.printf("Consumo = R$ %.2f%n", Bill.feeding());
			System.out.printf("Couvert = R$ %.2f%n", Bill.cover());
			System.out.printf("Ingresso = R$ %.2f%n", Bill.ticket());
			System.out.printf("%nValor a pagar = R$ %.2f%n", Bill.total());

		}

		sc.close();
	}
}
