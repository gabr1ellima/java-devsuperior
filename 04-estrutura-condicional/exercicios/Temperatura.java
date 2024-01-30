import java.util.Scanner;

public class Temperatura {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		char t1, t2, temperatura;
		Double fa, cel;

		t1 = 'F';
		t2 = 'C';

		System.out.print("Voce vai digitar a temperatura em qual escala (C/F)? ");
		temperatura = sc.next().charAt(0);

		if (temperatura == t1) {
			System.out.print("Digite a temperatura em Fahrenheit: ");
			fa = sc.nextDouble();

			System.out.printf("Temperatura equivalente em Celsius: %.2f", (fa - 32) / 1.8);
		} else if (temperatura == t2) {
			System.out.print("Digite a temperatura em Celsius: ");
			cel = sc.nextDouble();

			System.out.printf("Temperatura equivalente em Fahrenheit: %.2f", (cel * 1.8) + 32);
		}

		sc.close();
	}

}
