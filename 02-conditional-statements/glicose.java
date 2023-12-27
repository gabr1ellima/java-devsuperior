import java.util.Scanner;

public class glicose {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Double glicose;
		
		System.out.print("Digite a medida da glicose: ");
		glicose = sc.nextDouble();
		
		if (glicose <= 100.0) {
			System.out.printf("Classificacao: normal");
		} 
		else if (glicose <= 140.0) {
			System.out.printf("Classificacao: elevado");
		} 
		else {
			System.out.printf("Classificacao: diabetes");
		}
		
		sc.close();
	}

}
