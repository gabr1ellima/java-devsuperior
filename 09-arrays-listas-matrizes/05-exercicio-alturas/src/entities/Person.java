package entities;

public class Person {
	private String name;
	private int age;
	private double tall;

	public Person(String name, int age, double tall) {
		this.name = name;
		this.age = age;
		this.tall = tall;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public double getTall() {
		return tall;
	}
}
