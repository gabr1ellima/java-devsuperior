import java.util.Scanner;

public class MenorDeTres {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int valor1, valor2, valor3;

		System.out.println("Primeiro Valor: ");
		valor1 = sc.nextInt();

		System.out.println("Segundo Valor: ");
		valor2 = sc.nextInt();

		System.out.println("Terceiro Valor: ");
		valor3 = sc.nextInt();

		if (valor1 < valor2 && valor1 < valor3) {
			System.out.println(valor1);
		} else if (valor2 < valor3) {
			System.out.println(valor2);
		} else {
			System.out.println(valor3);
		}

		sc.close();
	}

}
