import java.util.Scanner;

public class Negativos {

	public static void main(String[] args) {
		
		// Correção: 
		// https://github.com/acenelio/curso-algoritmos/blob/master/java/negativos.java
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print("Digite um numero: ");
			arr[i] = sc.nextInt();
		}
		
		
		System.out.println("NUMEROS NEGATIVOS: ");
		
		for(int i = 0; i < arr.length; i++) {
			if (arr[i] < 0) {
				System.out.println(arr[i]);
			}
		}
		
		sc.close();
	}

}
