
public class Main {
	public static void main(String[] args){
		System.out.println(Temperature.toFahrenheit(-10.0F));
		System.out.println(Temperature.toFahrenheit(0.0F));
		System.out.println(Temperature.toFahrenheit(16.5F));
		System.out.println(Temperature.toFahrenheit(36.0F));
		
		System.out.println(Temperature.toCelsius(10.0F));
		System.out.println(Temperature.toCelsius(3.3F));
		System.out.println(Temperature.toCelsius(5.5F));
		System.out.println(Temperature.toCelsius(45.5F));
	}
}
