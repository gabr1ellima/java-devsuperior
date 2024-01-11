package entities;

public class Employee {
	public String name;
	public double grossSalary;
	public double tax;
	
	public double netSalary() {
		return grossSalary - tax;
	}
	
	public void increaseSalary(double percentage) {
		this.grossSalary = (this.grossSalary - tax) + (this.grossSalary * (percentage / 100));
	}
	
	public String toString() {
		return "Funcionario: "
			+ name
			+ ", $"
			+ String.format("%.2f", netSalary());
	}
	
	public String updatedData() {
		return "Dados atualizados: "
			+ name
			+ ", $"
			+ String.format("%.2f", grossSalary);
	}
}
