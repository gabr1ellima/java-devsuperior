import java.util.Scanner;

public class NumerosPares {

	public static void main(String[] args) {

		// Correção:
		// https://github.com/acenelio/curso-algoritmos/blob/master/java/numeros_pares.java

		Scanner sc = new Scanner(System.in);

		int qtdPares = 0;

		System.out.print("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();

		int[] arr = new int[n];

		for (int i = 0; i < arr.length; i++) {
			System.out.print("Digite um numero: ");
			arr[i] = sc.nextInt();
		}

		System.out.println();
		System.out.println("NUMEROS PARES: ");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				System.out.printf("%d ", arr[i]);
			}
		}

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				qtdPares++;
			}
		}

		System.out.printf("%n%nQUANTIDADE DE PARES = %d", qtdPares);

		sc.close();
	}

}
