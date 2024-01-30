package application;

import java.util.Scanner;

import util.CurrencyConverter;

public class Program {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Qual o valor do dólar? ");
		CurrencyConverter.dolarValue = sc.nextDouble();
		
		System.out.print("Quantos dólares serão comprados? ");
		CurrencyConverter.dolars = sc.nextDouble();
		
		System.out.printf("Valor a ser pago em reais = %.2f", CurrencyConverter.currency());

		sc.close();
	}
}
