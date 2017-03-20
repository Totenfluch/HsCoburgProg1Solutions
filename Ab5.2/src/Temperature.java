
public class Temperature {
	public static float toCelsius(float fahrenheit){
		return 5.0F/9.0F*(fahrenheit-32);
	}
	
	public static float toFahrenheit(float celsius){
		return 9.0F / 5.0F * celsius + 32;
	}
}
