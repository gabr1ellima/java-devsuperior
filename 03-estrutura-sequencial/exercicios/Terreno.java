import java.util.Scanner;

public class Terreno {

	// correcao:
	// https://github.com/acenelio/curso-algoritmos/blob/master/java/terreno.java

	public static void main(String[] args) {
		double largura, comprimento, metro;

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a largura do terreno: ");
		largura = sc.nextDouble();

		System.out.println("Digite o comprimento do terreno: ");
		comprimento = sc.nextDouble();

		System.out.println("Digite o valor do terreno: ");
		metro = sc.nextDouble();

		double area = largura * comprimento;
		double preco = metro * area;

		System.out.printf("Area do terreno = %.2f%n", area);
		System.out.printf("Preco do terreno = %.2f", preco);

		sc.close();

	}

}
