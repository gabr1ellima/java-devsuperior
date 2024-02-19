package application;

import java.util.Scanner;

import entities.Person;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int oldestPerson = 0;
		String oldestPersonName = "";

		System.out.print("Quantas pessoas voce vai digitar? ");
		int n = sc.nextInt();
		sc.nextLine();
		
		Person[] arr = new Person[n];
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println("Dados da " + (i + 1) + "a pessoa: ");
			
			System.out.print("Nome: ");
			String name = sc.nextLine();
			
			System.out.print("Idade: ");
			int age = sc.nextInt();
			sc.nextLine();
			
			arr[i] = new Person(name, age);
		}
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i].getAge() > oldestPerson) {
				oldestPerson = arr[i].getAge();
				oldestPersonName = arr[i].getName();
			}
		}
		
		System.out.println("PESSOA MAIS VELHA: " + oldestPersonName);
		
		sc.close();
	}
}