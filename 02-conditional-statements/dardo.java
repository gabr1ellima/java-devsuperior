import java.util.Scanner;

public class dardo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Double distancia1, distancia2, distancia3;
		
		System.out.println("Digite as tres distancias:");
		distancia1 = sc.nextDouble();
		distancia2 = sc.nextDouble();
		distancia3 = sc.nextDouble();
		
		if (distancia1 > distancia2 && distancia1 > distancia3 ) {
			System.out.printf("MAIOR DISTANCIA = %.2f", distancia1);
		} else if (distancia2 > distancia3) {
			System.out.printf("MAIOR DISTANCIA = %.2f", distancia2);
		} else {
			System.out.printf("MAIOR DISTANCIA = %.2f", distancia3);
		}
		
		sc.close();
	}

}
