package application;

import java.util.Scanner;

import entities.Account;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Account acc;
		
		System.out.print("Enter account number: ");
		int accountNumber = sc.nextInt();
		sc.nextLine();
		
		System.out.print("Enter account holder: ");
		String accountHolder = sc.nextLine();
		
		System.out.print("Is there na initial deposit (y/n)? ");
		char response = sc.next().charAt(0);
		
		if(response == 'y') {
			System.out.print("Enter initial deposit value: ");
			double balance = sc.nextDouble();
			acc = new Account(accountNumber, accountHolder, balance);
		} else {
			acc = new Account(accountNumber, accountHolder);
		}
		
		System.out.println();
		System.out.println("Account data:");
		System.out.println(acc);
		
		System.out.print("Enter a deposit value: ");
		double deposit = sc.nextDouble();
		acc.deposit(deposit);
		
		System.out.println("Updated account data: ");
		System.out.println(acc);
		
		System.out.print("Enter a withdraw value: ");
		double withdraw = sc.nextDouble();
		acc.withdraw(withdraw);
		
		System.out.println("Updated account data: ");
		System.out.println(acc);
		
		sc.close();
	}
}