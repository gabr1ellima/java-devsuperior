import java.util.Scanner;

public class Aumento {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double salario, novoSalario, aumento;

		System.out.print("Digite o salario da pessoa: ");
		salario = sc.nextDouble();

		if (salario <= 1000.0) {
			novoSalario = salario + (salario * 0.2);
			aumento = novoSalario - salario;
			System.out.printf("Novo salario = R$ %.2f%n", novoSalario);
			System.out.printf("Aumento = R$ %.2f%n", aumento);
			System.out.println("Porcentagem = 25 %");
		} else if (salario > 1000.0 && salario <= 3000.0) {
			novoSalario = salario + (salario * 0.15);
			aumento = novoSalario - salario;
			System.out.printf("Novo salario = R$ %.2f%n", novoSalario);
			System.out.printf("Aumento = R$ %.2f%n", aumento);
			System.out.println("Porcentagem = 15 %");
		} else if (salario > 3000.0 && salario <= 8000.0) {
			novoSalario = salario + (salario * 0.1);
			aumento = novoSalario - salario;
			System.out.printf("Novo salario = R$ %.2f%n", novoSalario);
			System.out.printf("Aumento = R$ %.2f%n", aumento);
			System.out.println("Porcentagem = 10 %");
		} else {
			novoSalario = salario + (salario * 0.05);
			aumento = novoSalario - salario;
			System.out.printf("Novo salario = R$ %.2f%n", novoSalario);
			System.out.printf("Aumento = R$ %.2f%n", aumento);
			System.out.println("Porcentagem = 5 %");
		}

		sc.close();
	}

}
