import java.util.Scanner;

public class SomaVetores {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Quantos valores vai ter cada vetor? ");
    int n = sc.nextInt();

    int[] arrA = new int[n];
    int[] arrB = new int[n];
    int[] arrC = new int[n];

    System.out.println("Digite os valores do vetor A:");
    for (int i = 0; i < arrA.length; i++) {
      arrA[i] = sc.nextInt();
    }

    System.out.println("Digite os valores do vetor B:");
    for (int i = 0; i < arrA.length; i++) {
      arrB[i] = sc.nextInt();
    }

    System.out.println("VETOR RESULTANTE:");
    for (int i = 0; i < arrC.length; i++) {
      arrC[i] = arrA[i] + arrB[i];
      System.out.println(arrC[i]);
    }

    sc.close();
  }
}
