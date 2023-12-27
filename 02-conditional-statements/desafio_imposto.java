import java.util.Scanner;


public class desafio_imposto {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double rendaAnualSalario, rendaAnualServ, rendaAnualCap, gastosMed, gastosEdu, salario, impostoSal, impostoServ, impostoCap;
		
		System.out.print("Renda anual com salário: ");		
		rendaAnualSalario = sc.nextDouble();
		System.out.print("Renda anual com prestação de serviço: ");		
		rendaAnualServ = sc.nextDouble();
		System.out.print("Renda anual com ganho de capital: ");		
		rendaAnualCap = sc.nextDouble();
		System.out.print("Gastos médicos: ");		
		gastosMed = sc.nextDouble();
		System.out.print("Gastos educacionais: ");		
		gastosEdu = sc.nextDouble();
		
		salario = rendaAnualSalario / 12;
		
		
		if (salario < 3000.0) {
			
			System.out.println();
			System.out.println("RELATÓRIO DE IMPOSTO DE RENDA");
			System.out.println();
			
			System.out.println("CONSOLIDADO DE RENDA:");
			
			System.out.println("Imposto sobre salário: Isento");
			
			impostoServ =  rendaAnualServ * 0.15;
			System.out.printf("Imposto sobre serviços: %.2f%n", impostoServ);
			
			impostoCap =  rendaAnualCap * 0.20;
			System.out.printf("Imposto sobre ganho de capital: %.2f%n", impostoCap);
			
			
			double gastosDedutiveis = gastosMed + gastosEdu;
			double impostoBruto = impostoServ + impostoCap;
			double maxDedutiveis = impostoBruto * 0.30;
			double impostoDevido = (maxDedutiveis > gastosDedutiveis) ? impostoBruto - gastosDedutiveis : impostoBruto - maxDedutiveis;
			
			System.out.println();
			System.out.println("DEDUÇÕES:");
			System.out.printf("Máximo dedutível: %.2f%n", maxDedutiveis);
			System.out.printf("Gastos dedutíveis: %.2f%n", gastosDedutiveis);
			
			System.out.println();
			System.out.println("RESUMO:");
			System.out.printf("Imposto bruto total: %.2f%n", impostoBruto);
			System.out.printf("Abatimento: %.2f%n", maxDedutiveis);
			System.out.printf("Imposto devido: %.2f%n", impostoDevido);
		}
		else if (salario > 3000 && salario < 5000) {
			
			System.out.println();
			System.out.println("RELATÓRIO DE IMPOSTO DE RENDA");
			System.out.println();
			
			System.out.println("CONSOLIDADO DE RENDA:");
			
			impostoSal = rendaAnualSalario * 0.10;
			System.out.printf("Imposto sobre salário: %.2f%n", impostoSal);
			
			impostoServ =  rendaAnualServ * 0.15;
			System.out.printf("Imposto sobre serviços: %.2f%n", impostoServ);
			
			impostoCap =  rendaAnualCap * 0.20;
			System.out.printf("Imposto sobre ganho de capital: %.2f%n", impostoCap);
			
			
			double gastosDedutiveis = gastosMed + gastosEdu;
			double impostoBruto = impostoSal + impostoServ + impostoCap;
			double maxDedutiveis = impostoBruto * 0.30;
			double impostoDevido = (maxDedutiveis > gastosDedutiveis) ? impostoBruto - gastosDedutiveis : impostoBruto - maxDedutiveis;
			
			System.out.println();
			System.out.println("DEDUÇÕES:");
			System.out.printf("Máximo dedutível: %.2f%n", maxDedutiveis);
			System.out.printf("Gastos dedutíveis: %.2f%n", gastosDedutiveis);
			
			System.out.println();
			System.out.println("RESUMO:");
			System.out.printf("Imposto bruto total: %.2f%n", impostoBruto);
			System.out.printf("Abatimento: %.2f%n", maxDedutiveis);
			System.out.printf("Imposto devido: %.2f%n", impostoDevido);
			
		}
		else {
			
			System.out.println();
			System.out.println("RELATÓRIO DE IMPOSTO DE RENDA");
			System.out.println();
			
			System.out.println("CONSOLIDADO DE RENDA:");
			
			impostoSal = rendaAnualSalario * 0.20;
			System.out.printf("Imposto sobre salário: %.2f%n", impostoSal);
			
			impostoServ =  rendaAnualServ * 0.15;
			System.out.printf("Imposto sobre serviços: %.2f%n", impostoServ);
			
			impostoCap =  rendaAnualCap * 0.20;
			System.out.printf("Imposto sobre ganho de capital: %.2f%n", impostoCap);
			
			
			double gastosDedutiveis = gastosMed + gastosEdu;
			double impostoBruto = impostoSal + impostoServ + impostoCap;
			double maxDedutiveis = impostoBruto * 0.30;
			double impostoDevido = (maxDedutiveis > gastosDedutiveis) ? impostoBruto - gastosDedutiveis : impostoBruto - maxDedutiveis;
			
			System.out.println();
			System.out.println("DEDUÇÕES:");
			System.out.printf("Máximo dedutível: %.2f%n", maxDedutiveis);
			System.out.printf("Gastos dedutíveis: %.2f%n", gastosDedutiveis);
			
			System.out.println();
			System.out.println("RESUMO:");
			System.out.printf("Imposto bruto total: %.2f%n", impostoBruto);
			System.out.printf("Abatimento: %.2f%n", maxDedutiveis);
			System.out.printf("Imposto devido: %.2f%n", impostoDevido);
		}
		sc.close();
	}


}
