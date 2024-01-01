import java.util.Scanner;

public class par_impar {

	public static void main(String[] args) {
		
		// correcao:
		// https://github.com/acenelio/curso-algoritmos/blob/master/java/par_impar.java
		
		Scanner sc = new Scanner(System.in);
		
		int n, numero;
		
		System.out.print("Quantos numeros voce vai digitar? ");
		n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			System.out.print("Digite um numero: ");
			numero = sc.nextInt();
			
			if (numero == 0) {
				System.out.println("NULO");
			} else if (numero < 0 && numero % 2 == 1) {
				System.out.println("IMPAR NEGATIVO");
			} else if (numero < 0 && numero % 2 == 0) {
				System.out.println("PAR NEGATIVO");
			} else if (numero > 0 && numero % 2 == 1) {
				System.out.println("IMPAR POSITIVO");
			} else {
				System.out.println("IMPAR NEGATIVO");
			}
		}
		
		sc.close();
	}

}
