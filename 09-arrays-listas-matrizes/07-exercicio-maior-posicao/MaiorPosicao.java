import java.util.Scanner;

public class MaiorPosicao {

	public static void main(String[] args) {

		// Correção:
		// https://github.com/acenelio/curso-algoritmos/blob/master/java/maior_posicao.java

		Scanner sc = new Scanner(System.in);

		double major = 0.0;
		int index = 0;

		System.out.print("Quantos numeros voce vai digitar? ");

		int n = sc.nextInt();

		double[] arr = new double[n];

		for (int i = 0; i < arr.length; i++) {
			System.out.print("Digite um numero: ");
			arr[i] = sc.nextDouble();
		}

		for (int i = 0; i < arr.length; i++) {
			if (major < arr[i]) {
				major = arr[i];
			}
		}

		System.out.printf("MAIOR VALOR = %.1f%n", major);

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == major) {
				System.out.println("POSICAO DO MAIOR VALOR = " + index);
			}
			index++;
		}
		sc.close();
	}
}
