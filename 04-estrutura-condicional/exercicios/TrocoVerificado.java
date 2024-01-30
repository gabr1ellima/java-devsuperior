import java.util.Scanner;

public class TrocoVerificado {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Double precoProduto, valorRecebido, troco, totalCompra;
		int quantidade;

		System.out.print("Preco unitario do produto: ");
		precoProduto = sc.nextDouble();

		System.out.print("Quantidade comprada: ");
		quantidade = sc.nextInt();

		System.out.print("Dinheiro recebido: ");
		valorRecebido = sc.nextDouble();

		totalCompra = precoProduto * quantidade;

		if (totalCompra > valorRecebido) {
			System.out.printf("DINHEIRO INSUFICIENTE. FALTAM %.2f REAIS", totalCompra - valorRecebido);
		} else {
			troco = valorRecebido - totalCompra;
			System.out.printf("TROCO = %.2f", troco);
		}

		sc.close();
	}

}
