import java.util.Scanner;

public class Notas {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Double nota1, nota2, notaFinal;

		System.out.println("Digite a primeira nota: ");
		nota1 = sc.nextDouble();

		System.out.println("Digite a segunda nota: ");
		nota2 = sc.nextDouble();

		notaFinal = nota1 + nota2;

		System.out.printf("NOTA FINAL = %.1f%n", notaFinal);

		if (notaFinal < 60.0) {
			System.out.println("REPROVADO");
		}

		sc.close();
	}

}
