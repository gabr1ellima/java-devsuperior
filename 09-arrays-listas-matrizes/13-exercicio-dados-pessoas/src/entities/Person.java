package entities;

public class Person {
	private double tall;
	private char gender;

	public Person(double tall, char gender) {
		this.tall = tall;
		this.gender = gender;
	}

	public double getTall() {
		return tall;
	}

	public double getGender() {
		return gender;
	}

	public void setTall(double tall) {
		this.tall = tall;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}
}
