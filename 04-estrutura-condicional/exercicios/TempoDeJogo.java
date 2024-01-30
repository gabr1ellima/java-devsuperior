import java.util.Scanner;

public class TempoDeJogo {

	public static void main(String[] args) {

		// correcao:
		// https://github.com/acenelio/curso-algoritmos/blob/master/java/tempo_de_jogo.java

		Scanner sc = new Scanner(System.in);

		int horaInicial, horaFinal, dia, duracao;

		System.out.print("Hora inicial: ");
		horaInicial = sc.nextInt();

		System.out.print("Hora final: ");
		horaFinal = sc.nextInt();

		dia = 24;

		duracao = dia + horaFinal - horaInicial;

		if (horaInicial > horaFinal) {
			System.out.printf("O JOGO DUROU %d HORA(S)", duracao);
		} else if (horaInicial < horaFinal) {
			duracao = horaFinal - horaInicial;
			System.out.printf("O JOGO DUROU %d HORA(S)", duracao);
		} else {
			System.out.println("A duracao da partida precisa ser maior que 1hr");
		}

		sc.close();
	}

}
