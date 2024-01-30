package util;

public class CurrencyConverter {
	public static final double IOF = 0.06;
	public static double dolarValue;
	public static double dolars;
	
	public static double currency () {
		return dolarValue * dolars * (1 +IOF);
	}
}
