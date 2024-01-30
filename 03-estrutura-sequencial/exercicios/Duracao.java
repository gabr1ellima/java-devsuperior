import java.util.Scanner;

public class Duracao {

	public static void main(String[] args) {

		// correcao:
		// https://github.com/acenelio/curso-algoritmos/blob/master/java/duracao.java

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a duracao em segundos:");
		int segundos = sc.nextInt();
		int horas = segundos / 3600;
		int minutos = (segundos % 3600) / 60;
		int segundo = (segundos % 3600) % 60;

		System.out.printf("%d:%d:%d", horas, minutos, segundo);

		sc.close();
	}

}
