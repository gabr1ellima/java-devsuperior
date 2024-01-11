package entities;

public class Student {
	public String name;
	public double grade1;
	public double grade2;
	public double grade3;
	public double result;
	public double pointsMissing;
	
	public double finalGrade() {
		result = grade1 + grade2 + grade3;
		return result;
	}
	
	public String result() {
		
		pointsMissing = 60 - result;
		
		if (result >= 60) {
			return "PASS";
		} 
		else if (result == 59) {
			return "FAILED"
					+ String.format("%nFALTOU %.2f", pointsMissing)
					+ " PONTO";
		}
		else {
			return "FAILED"
				+ String.format("%nFALTARAM %.2f", pointsMissing)
				+ " PONTOS";
		}
	}
	
	public String toString() {
		return "NOTA FINAL = "
			+ String.format("%.2f%n", finalGrade())
			+ result();
	}
}
