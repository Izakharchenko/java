
public class ConvertorDemo {

	public static void main(String[] args) {
		TemperatureConverter t1 = new TemperatureConverter();
		System.out.println(t1.convertTemp(4, 'F'));
		System.out.println(t1.convertTemp(0, 'F'));
		System.out.println("Now: " + t1.convertTemp(10, 'F') + "F*");

	}

}
