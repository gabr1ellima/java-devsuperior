import java.util.Scanner;

public class SomaImpares {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int x, y, somaImpares;
		System.out.println("Digite dois numeros: ");

		x = sc.nextInt();
		y = sc.nextInt();
		somaImpares = 0;

		for (int i = x - 1; i > y; i--) {
			if (i % 2 == 1 || i % 2 == -1) {
				somaImpares += i;
			}
		}

		for (int i = x + 1; i < y; i++) {
			if (i % 2 == 1 || i % 2 == -1) {
				somaImpares += i;
			}
		}

		System.out.println(somaImpares);

		sc.close();
	}

}

/*
 * public class soma_impares {
 * 
 * public static void main(String[] args) {
 * Scanner sc = new Scanner(System.in);
 * 
 * int x, y, a, intervalo;
 * 
 * System.out.println("Digite dois números: ");
 * x = sc.nextInt();
 * y = sc.nextInt();
 * a = 0;
 * intervalo = 0;
 * 
 * if (x < y) {
 * if (x % 2 == 1 || y % 2 == 1) {
 * a = 1;
 * intervalo = (y - x) / 2 + a;
 * }
 * }
 * else {
 * intervalo = (x - y) / 2 + 0;
 * }
 * 
 * 
 * 
 * // if (x < y && x - y) {
 * // intervalo = (y - x) / 2 + 1;
 * // }else {
 * // intervalo = (x - y) / 2 + 1;
 * // }
 * //
 * System.out.println(intervalo);
 * sc.close();
 * }
 * 
 * }
 */

/*
 * Scanner sc = new Scanner(System.in);
 * 
 * int x, y, z = 0, soma = 0;
 * 
 * System.out.println("Digite dois numeros:");
 * x = sc.nextInt();
 * y = sc.nextInt();
 * 
 * 
 * if(x > y) {
 * z = y;
 * y = x;
 * x = z;
 * }
 * 
 * if (x % 2 == 0 || x % 2 == -1) {
 * x++;
 * for (i = 0; x < y; i++) {
 * System.out.println(x);
 * soma = soma + x;
 * x = x + 2;
 * 
 * }
 * System.out.println(soma);
 * }
 * 
 * sc.close();
 */
