import java.util.Scanner;

public class MediaIdades {

	// correcao:
	// https://github.com/acenelio/curso-algoritmos/blob/master/java/media_idades.java

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite as idades:");

		int idade = sc.nextInt();
		double mediaIdade = 0.0;
		int contador = 0;

		while (idade > 0) {
			contador += 1;
			mediaIdade += idade;
			idade = sc.nextInt();
		}

		if (contador > 1) {
			System.out.printf("MEDIA = %.2f", mediaIdade / contador);
		} else {
			System.out.println("IMPOSSIVEL CALCULAR");
		}

		sc.close();
	}

}
/*
 * Scanner sc = new Scanner(System.in);
 * 
 * System.out.print("Digite a primeira nota: ");
 * double x = sc.nextDouble();
 * 
 * while (x < 0 || x > 10) {
 * System.out.print("Valor invalido! Tente novamente: ");
 * x = sc.nextDouble();
 * }
 * 
 * System.out.print("Digite a segunda nota: ");
 * double y = sc.nextDouble();
 * 
 * while (y < 0 || y > 10) {
 * System.out.print("Valor invalido! Tente novamente: ");
 * y = sc.nextDouble();
 * }
 * 
 * System.out.printf("MEDIA = %.2f", (x + y) / 2 );
 * 
 * sc.close();
 */