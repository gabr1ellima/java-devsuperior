import java.util.Scanner;

public class Atletas {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int qtdAtletas;
		double altura, peso, atletaMaisAlto = 0, alturaMulheres = 0, pesoMedio = 0, totalHomens = 0, totalMulheres = 0;
		String nome, nomeMaisAlto = "A", sexo;

		System.out.print("Qual a quantidade de atletas? ");
		qtdAtletas = sc.nextInt();

		for (int i = 0; i < qtdAtletas; i++) {
			System.out.printf("Digite os dados do atleta numero %d: %n", i + 1);
			System.out.print("Nome: ");
			nome = sc.next() + " " + sc.next();

			System.out.print("Sexo: ");
			sexo = sc.next();

			while (!sexo.equals("F") && !sexo.equals("M")) {
				System.out.print("Valor invalido! Favor digitar F ou M: ");
				sexo = sc.next();
			}

			System.out.print("Altura: ");
			altura = sc.nextDouble();

			while (altura <= 0) {
				System.out.print("Valor invalido! Favor digitar um valor positivo: ");
				altura = sc.nextDouble();
			}

			if (atletaMaisAlto < altura) {
				atletaMaisAlto = altura;
				nomeMaisAlto = nome;
			}

			System.out.print("Peso: ");
			peso = sc.nextDouble();

			while (peso <= 0) {
				System.out.print("Valor invalido! Favor digitar um valor positivo: ");
				peso = sc.nextDouble();
			}

			pesoMedio = pesoMedio + peso;

			if (sexo.equals("M")) {
				totalHomens++;
			} else if (sexo.equals("F")) {
				totalMulheres++;
				alturaMulheres += altura;
			}
		}

		System.out.println("RELATORIO:");
		System.out.printf("Peso medio dos atletas: %.2f%n", pesoMedio / qtdAtletas);
		System.out.println("Atleta mais alto: " + nomeMaisAlto);
		System.out.printf("Porcentagem de homens: %.1f%%%n", (totalHomens / qtdAtletas) * 100);
		if (totalMulheres != 0) {
			System.out.printf("Altura media das mulheres: %.2f", alturaMulheres / totalMulheres);
		} else {
			System.out.println("Nao ha mulheres cadastradas");
		}
		sc.close();
	}

}
