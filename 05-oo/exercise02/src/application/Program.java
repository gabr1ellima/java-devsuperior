package application;

import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Employee employee = new Employee();
		System.out.print("Nome: ");
		employee.name = sc.nextLine();
		
		System.out.print("Salario: ");
		employee.grossSalary = sc.nextDouble();
		
		System.out.print("Imposto: ");
		employee.tax = sc.nextDouble();
		
		System.out.println(employee);
		
		System.out.println("Qual a porcentagem para aumentar o salário? ");
		double percentage = sc.nextDouble();
		employee.increaseSalary(percentage);
		
		System.out.println(employee.updatedData());
		
		sc.close();
	}

}
