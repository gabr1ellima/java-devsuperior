package entities;

public class Rent {
	private String name;
	private String email;
	private int roomNumber;

	public Rent(String name, String email, int roomNumber) {
		this.name = name;
		this.email = email;
		this.roomNumber = roomNumber;
	}
	
	public String getName() {
		return name;
	}
	
	public String getEmail() {
		return email;
	}
	
	public int getRoomNumber() {
		return roomNumber;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}
	
	public String toString() {
		return getName()
			  + ", "
			  + getEmail();
	}
}
