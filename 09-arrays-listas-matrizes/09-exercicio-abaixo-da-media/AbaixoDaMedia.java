import java.util.Scanner;

public class AbaixoDaMedia {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    double avg = 0.0;
    double sum = 0.0;

    System.out.print("Quantos elementos vai ter o vetor? ");
    int n = sc.nextInt();

    double[] arr = new double[n];

    for (int i = 0; i < arr.length; i++) {
      System.out.print("Digite um numeto: ");
      arr[i] = sc.nextDouble();
      sum += arr[i];
    }

    avg = sum / arr.length;
    System.out.printf("%nMEDIA DO VETOR = %.3f%n", avg);

    System.out.println("ELEMENTOS ABAIXO DA MEDIA:");
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] < avg) {
        System.out.println(arr[i]);
      }
    }
    sc.close();
  }
}
