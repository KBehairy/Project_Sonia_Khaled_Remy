
public class Converter {
	
	/*
	 * @Author: Sonia Obi
	 * 			Khaled Behairy
	 * 			Remy Onyegbutulem 
	 */

	
	private double celsiusToFahrenheit(double C){
		// TODO: The third student will implement this method
		
		// Third student: Remy Onyegbutulem 
		double F = ( C*(9/5) ) + 32 ; 
		return F;
	}
	
	private double fahrenheitToCelsius(double F){
		// TODO: The second student will implement this method
		double C = (F - 32) * (5/9);
		
		return C;
	}
	
	public static void main(String[] args) {
		//TODO: The first student will implement this method.
		// Call CelsiusToFahrenheit to convert 180 Celsius to Fahrenheit value.
		// Call FahrenheitToCelsius to convert 250 Fahrenheit to Celsius value.
	}
	
}
