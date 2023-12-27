import java.util.Scanner;

public class baskara {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Double a, b, c, delta, x1, x2;
		
		System.out.println("Coeficiente a: ");
		a = sc.nextDouble();
		
		System.out.println("Coeficiente b: ");
		b = sc.nextDouble();
		
		System.out.println("Coeficiente c: ");
		c = sc.nextDouble();
		
		delta = Math.pow(b, 2) - (4 * a * c);
		
		if (delta < 0) {
			System.out.println("Esta equacao nao possui raizes reais");
		} else {
			x1 = (- b + Math.sqrt(delta)) / (2 * a);
			x2 = (- b - Math.sqrt(delta)) / (2 * a);

			System.out.printf("X1 = %.4f%n", x1);
			System.out.printf("X2 = %.4f", x2);
		}
		
		sc.close();
	}

}
