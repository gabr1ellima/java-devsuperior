package application;

import java.util.Scanner;

import entities.Person;

public class Program {
	public static void main(String[] args) {
		
		// Correção: 
		// https://github.com/acenelio/curso-algoritmos/blob/master/java/alturas.java

		Scanner sc = new Scanner(System.in);
		
		int count = 0;
		double tallAvg = 0.0;
		double underage = 0.0;
		double percentage = 0.0;

		System.out.print("Quantas pessoas serao digitadas? ");
		int n = sc.nextInt();
		
		Person[] arr = new Person[n];
		
		for (int i = 0; i < arr.length; i++) {
			sc.nextLine();
			count++;
			System.out.printf("Dados da %da pessoa: %n", count);
			
			System.out.print("Nome: ");
			
			String name = sc.nextLine();
			
			System.out.print("Idade: ");
			int age = sc.nextInt();
			
			System.out.print("Altura: ");
			double tall = sc.nextDouble();
			
			arr[i] = new Person(name, age, tall);
		}
		
		for (int i = 0; i < arr.length; i++) {
			tallAvg += arr[i].getTall() / arr.length;
			if (arr[i].getAge() < 16) {
				underage++;
			}
		}
		
		percentage = underage / arr.length * 100;
		
		System.out.printf("Altura média: %.2f%n", tallAvg);
		System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n", percentage);
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].getAge() < 16) {
				System.out.println(arr[i].getName());
			}
		}
		
		sc.close();
	}
}