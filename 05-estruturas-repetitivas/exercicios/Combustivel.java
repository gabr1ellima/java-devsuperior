import java.util.Scanner;

public class Combustivel {

	public static void main(String[] args) {

		// correcao:
		// https://github.com/acenelio/curso-algoritmos/blob/master/java/combustivel.java

		Scanner sc = new Scanner(System.in);

		int codigo, alcool, gasolina, diesel;

		codigo = 0;
		alcool = 0;
		gasolina = 0;
		diesel = 0;

		while (codigo != 4) {
			System.out.print("Informe um codigo (1, 2, 3) ou 4 para parar: ");
			codigo = sc.nextInt();

			if (codigo == 1) {
				alcool += 1;
			} else if (codigo == 2) {
				gasolina += 1;
			} else if (codigo == 3) {
				diesel += 1;
			}

		}

		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);

		sc.close();

	}

}

/*
 * Scanner sc = new Scanner(System.in);
 * 
 * int cod = 0, alcool = 0, gasolina = 0, diesel = 0;
 * 
 * while (cod != 4) {
 * System.out.print("Informe um codigo (1, 2, 3) ou 4 para parar: ");
 * cod = sc.nextInt();
 * 
 * if (cod == 1) {
 * alcool++;
 * }
 * else if (cod == 2) {
 * gasolina++;
 * }
 * else if (cod == 2) {
 * diesel++;
 * }
 * }
 * 
 * System.out.println("MUITO OBRIGADO");
 * System.out.printf("Alcool: %d%n", alcool);
 * System.out.printf("Gasolina: %d%n", gasolina);
 * System.out.printf("Diesel: %d%n", diesel);
 * 
 * sc.close();
 * }
 */