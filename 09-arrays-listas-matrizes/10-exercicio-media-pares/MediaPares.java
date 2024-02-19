import java.util.Scanner;

public class MediaPares {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int sum = 0;
    int count = 0;
    double avg = 0.0;

    System.out.print("Quantos elementos vai ter o vetor? ");
    int n = sc.nextInt();
    int[] arr = new int[n];

    for (int i = 0; i < arr.length; i++) {
      System.out.print("Digite um numero: ");
      arr[i] = sc.nextInt();
      if (arr[i] % 2 == 0) {
        sum += arr[i];
        count++;
      }
    }

    if (sum > 0) {
      avg = sum / count;
      System.out.printf("MEDIA DOS PARES = %.1f", avg);
    } else {
      System.out.println("NENHUM NUMERO PAR");
    }
    sc.close();
  }
}
