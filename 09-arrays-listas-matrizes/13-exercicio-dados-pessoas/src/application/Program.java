package application;

import java.util.Scanner;

import entities.Person;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int countMen = 0;
		int countWomen = 0;
		double tallest = 0;
		double smallest = 3.0;
		double countTall = 0;

		System.out.print("Quantas pessoas serao digitadas? ");
		int n = sc.nextInt();

		Person[] arr = new Person[n];

		for (int i = 0; i < arr.length; i++) {
			System.out.print("Altura da " + (i + 1) + "a pessoa: ");
			double tall = sc.nextDouble();

			System.out.print("Genero da " + (i + 1) + "a pessoa: ");
			char gender = sc.next().charAt(0);

			arr[i] = new Person(tall, gender);
		}

		for (int i = 0; i < arr.length; i++) {
			if (arr[i].getTall() < smallest) {
				smallest = arr[i].getTall();
			}
			if (arr[i].getTall() > tallest) {
				tallest = arr[i].getTall();
			}
			if (arr[i].getGender() == 'F') {
				countWomen++;
				countTall += arr[i].getTall();
			}
			if (arr[i].getGender() == 'M') {
				countMen++;
			}
		}

		System.out.printf("Menor altura = %.2f%n", smallest);
		System.out.printf("Maior altura = %.2f%n", tallest);
		System.out.printf("Media das alturas das mulheres = %.2f%n", countTall / countWomen);
		System.out.printf("Numero de homens = %d", countMen);

		sc.close();
	}
}