import java.util.Scanner;

public class MediaPonderada {

	public static void main(String[] args) {

		// correcao:
		// https://github.com/acenelio/curso-algoritmos/blob/master/java/media_ponderada.java

		Scanner sc = new Scanner(System.in);

		int n;
		double n1, n2, n3, mediaPonderada = 0;

		System.out.print("Quantos casos voce vai digitar: ");
		n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.println("Digite tres numeros: ");
			n1 = sc.nextDouble();
			n2 = sc.nextDouble();
			n3 = sc.nextDouble();

			mediaPonderada = ((n1 * 2) + (n2 * 3) + (n3 * 5)) / 10;

			System.out.printf("MEDIA = %.1f%n", mediaPonderada);
		}
		sc.close();
	}

}
