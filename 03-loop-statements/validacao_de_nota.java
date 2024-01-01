import java.util.Scanner;

public class validacao_de_nota {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double av1, av2, media;
		
		System.out.print("Digite a primeira nota: ");
		av1 = sc.nextDouble();
		
		while (av1 < 0 || av1 > 10) {
			System.out.print("Valor invalido! Tente novamente: ");
			av1 = sc.nextDouble();
		}
		
		System.out.print("Digite a segunda nota: ");
		av2 = sc.nextDouble();

		while (av2 < 0 || av2 > 10) {
			System.out.print("Valor invalido! Tente novamente: ");
			av2 = sc.nextDouble();
		}
		
		media = (av1 + av2) / 2;
		
		System.out.printf("MEDIA = %.2f", media);
		
		sc.close();

	}

}
