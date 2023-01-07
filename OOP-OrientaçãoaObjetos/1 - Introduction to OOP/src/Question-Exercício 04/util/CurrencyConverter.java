package util;

public class CurrencyConverter {
	
public static final double IOF = 0.06;

	public static double estimate(double dollar, double quantity) {
		
		return dollar * quantity * (1.0 + IOF);		
		
	}

}
