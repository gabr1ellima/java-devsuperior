import java.util.Scanner;

public class operadora {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int minutos;
		
		Double valorPagar = 50.0;
		
		System.out.println("Digite a quantidade de minutos: ");
		minutos = sc.nextInt();
		
		if (minutos > 100) {
			int taxa = (minutos - 100) * 2;
			System.out.printf("Valor a pagar: R$ %.2f", valorPagar + taxa);
		} else {
			System.out.printf("Valor a pagar: R$ %.2f", valorPagar);
		}
		
		sc.close();
	}

}
