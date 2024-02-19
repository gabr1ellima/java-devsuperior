package application;

import java.util.Scanner;

import entities.Product;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int profitLower10 = 0;
		int profit10To20 = 0;
		int profitGreater20 = 0;
		double totalPurchase = 0.0;
		double totalSale = 0.0;

		System.out.print("Serao digitados dados de quantos produtos? ");
		int n = sc.nextInt();
		Product[] arr = new Product[n];
		
		for (int i = 0; i < arr.length; i++) {
			sc.nextLine();
			System.out.println("Produto "+ (i + 1) + ":");
			
			System.out.print("Nome: ");
			String name = sc.nextLine();
			
			System.out.print("Preco de compra: ");
			double purchasePrice = sc.nextDouble();
			
			System.out.print("Preco de venda: ");
			double salePrice = sc.nextDouble();
			
			arr[i] = new Product(name, purchasePrice, salePrice);
		}
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].profitMargin() < 10) {
				profitLower10++;
			}
			
			if (arr[i].profitMargin() >= 10 && arr[i].profitMargin() <= 20) {
				profit10To20++;
			}
			
			if (arr[i].profitMargin() > 20) {
				profitGreater20++;
			}
			
			totalPurchase += arr[i].getPurchasePrice();
			totalSale += arr[i].getSellPrice();
		}
		
		System.out.println("RELATORIO: ");
		System.out.println("Lucro abaixo de 10%: " + profitLower10);
		System.out.println("Lucro entre 10% e 20%: " + profit10To20);
		System.out.println("Lucro acima de 20%: " + profitGreater20);
		System.out.printf("Valor total de compra: %.2f%n", totalPurchase);
		System.out.printf("Valor total de venda: %.2f%n", totalSale);
		System.out.printf("Lucro total: %.2f%n", totalSale - totalPurchase);

		sc.close();
	}
}