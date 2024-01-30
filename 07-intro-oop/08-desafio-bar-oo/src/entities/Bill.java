package entities;

public class Bill {
	public static char gender;
	public static int beer;
	public static int barbecue;
	public static int softDrink;
	
	public static double cover () {
		if (feeding() > 30 ) {
			return 0;
		} else {
			return 4;
		}
	}
	
	public static double feeding () {
		return (beer * 5) + (barbecue * 7) + (softDrink * 3);
	}
	
	public static double ticket () {
		if (gender == 'F') {
			return 8;
		} else {
			return 10;
		}
	}
	
	public static double total () {
		return feeding() + ticket() + cover();
	}	
}
