package application;

import java.util.Scanner;

import entities.Student;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos alunos serao digitados? ");
		int n = sc.nextInt();
		
		Student[] arr = new Student[n];
		
		for(int i = 0; i < arr.length; i++) {
			sc.nextLine();
			System.out.println("Digite nome, primeira e segunda nota do " + (i + 1) + "o aluno: ");
			String name = sc.nextLine();
			double grade1 = sc.nextDouble();
			double grade2 = sc.nextDouble();
			arr[i] = new Student(name, grade1, grade2);
		}
		
		System.out.println("Alunos aprovados:");
		for(int i = 0; i < arr.length; i++) {
			if(arr[i].avg() >= 6.0) {
				System.out.println(arr[i].getName());
			}
		}
		
		sc.close();
	}
}