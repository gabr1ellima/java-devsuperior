import java.util.Scanner;

public class divisao {
	
	public static void main(String[] args) {
		// correção:
		// https://github.com/acenelio/curso-algoritmos/blob/master/java/divisao.java
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos casos voce vai digitar? ");
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			System.out.print("Entre com o numerador: ");
			int numerator = sc.nextInt();
			
			System.out.print("Entre com o denominador: ");
			int denominator = sc.nextInt();
			
			if (denominator == 0 || numerator < 0) {
				System.out.println("DIVISAO IMPOSSIVEL");
			} else {
				double division = (double)numerator / denominator;
				System.out.printf("DIVISAO = %.2f%n", division);
			}
		}
		
		sc.close();
	}

}
