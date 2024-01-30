import java.util.Scanner;

public class Lanchonete {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int codigo, quantidade;
		Double valorTotal;

		System.out.print("Codigo do produto comprado: ");
		codigo = sc.nextInt();

		System.out.print("Quantidade comprada: ");
		quantidade = sc.nextInt();

		if (codigo == 1) {
			valorTotal = (double) quantidade * 5.00;
			System.out.printf("Valor a pagar: R$ %.2f", valorTotal);
		} else if (codigo == 2) {
			valorTotal = (double) quantidade * 3.50;
			System.out.printf("Valor a pagar: R$ %.2f", valorTotal);
		} else if (codigo == 3) {
			valorTotal = (double) quantidade * 4.80;
			System.out.printf("Valor a pagar: R$ %.2f", valorTotal);
		} else if (codigo == 4) {
			valorTotal = (double) quantidade * 8.90;
			System.out.printf("Valor a pagar: R$ %.2f", valorTotal);
		} else if (codigo == 5) {
			valorTotal = (double) quantidade * 7.32;
			System.out.printf("Valor a pagar: R$ %.2f", valorTotal);
		} else {
			System.out.println("Produto nao existe.");
		}

		sc.close();
	}

}
