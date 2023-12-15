import java.util.Scanner;

public class retangulo {
	
	//correcao: https://github.com/acenelio/curso-algoritmos/blob/master/java/retangulo.java

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Base do retangulo: ");
		double base = sc.nextDouble();
		
		System.out.println("Altura do retangulo: ");
		double altura = sc.nextDouble();
		
		double area = base * altura;
		double perimetro = (base + altura) * 2;
		double diagonal = Math.sqrt((base * base) + (altura * altura));
		
		System.out.printf("AREA = %.4f%n", area);
		System.out.printf("PERIMETRO = %.4f%n", perimetro);
		System.out.printf("DIAGONAL = %.4f", diagonal);
		
		sc.close();
	}

}
