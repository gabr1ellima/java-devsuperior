import java.util.Scanner;

public class dentro_fora {

	public static void main(String[] args) {

		// correcao:
		// https://github.com/acenelio/curso-algoritmos/blob/master/java/dentro_fora.java
		
		Scanner sc = new Scanner(System.in);
		
		int n, x, dentro = 0, fora = 0;
		
		System.out.print("Quantos numeros voce vai digitar? ");
		n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			System.out.print("Digite um numero: ");
			x = sc.nextInt();
			
			if (x <= 20 & x >= 10) {
				dentro ++;
			}
			else {
				fora ++;
			}
		}
		
		System.out.println(dentro + " DENTRO");
		System.out.println(fora + " FORA");
		
		sc.close();
	}

}
