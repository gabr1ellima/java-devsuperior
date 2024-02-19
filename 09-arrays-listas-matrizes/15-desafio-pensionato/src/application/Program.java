package application;

import java.util.Scanner;

import entities.Rent;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Rent[] arr = new Rent[9];
		System.out.print("How many rooms will be rented? ");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.println("Rent #" + (i + 1));
			
			System.out.print("Name: ");
			String name = sc.nextLine();
			sc.nextLine();
			
			System.out.print("Email: ");
			String email = sc.nextLine();

			System.out.print("Room: ");
			int roomNumber = sc.nextInt();

			arr[roomNumber - 1] = new Rent(name, email, roomNumber);
		}
		System.out.println();
		System.out.println("Busy rooms: ");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != null) {
				System.out.print((i + 1) + ": ");
				System.out.println(arr[i]);
			}
		}
		sc.close();
	}
}