import java.util.Scanner;

public class Multiplos {

	public static void main(String[] args) {

		// correcao:
		// https://github.com/acenelio/curso-algoritmos/blob/master/java/multiplos.java

		Scanner sc = new Scanner(System.in);

		int number1, number2;

		System.out.println("Type two integer numbers: ");
		number1 = sc.nextInt();
		number2 = sc.nextInt();

		if (number1 % number2 == 0 || number2 % number1 == 0) {
			System.out.println("Sao multiplos");
		} else {
			System.out.println("Nao sao multiplos");
		}

		sc.close();
	}

}
