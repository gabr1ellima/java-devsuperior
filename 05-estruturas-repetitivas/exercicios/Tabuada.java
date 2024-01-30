import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
		// correcao:
		// https://github.com/acenelio/curso-algoritmos/blob/master/java/tabuada.java
		Scanner sc = new Scanner(System.in);
		int soma = 0;

		System.out.print("Deseja a tuabada para qual valor? ");
		int x = sc.nextInt();

		for (int i = 0; i <= 10; i++) {
			soma = x * i;
			System.out.printf("%d x %d = %d%n", x, i, soma);
		}
		sc.close();
	}

}
