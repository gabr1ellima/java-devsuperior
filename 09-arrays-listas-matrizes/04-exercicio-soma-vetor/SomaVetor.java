import java.util.Scanner;

public class SomaVetor {

	public static void main(String[] args) {
		
		// Correção:
		// https://github.com/acenelio/curso-algoritmos/blob/master/java/soma_vetor.java
		
		Scanner sc = new Scanner(System.in);
		
		double sum = 0.0;
		double avg = 0.0;
		
		System.out.print("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();
		
		double[] arr = new double[n];
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print("Digite um numero: ");
			arr[i] = sc.nextDouble();
		}
		
		System.out.print("VALORES = ");
		for (int i = 0; i < arr.length; i++) {
			System.out.printf("%.1f ",arr[i]);
			sum += arr[i];
			avg += arr[i] / arr.length;
		}
		
		System.out.printf("%nSOMA = %.2f", sum);
		
		
		System.out.printf("%nMEDIA = %.2f", avg);
		
		sc.close();
	}

}
