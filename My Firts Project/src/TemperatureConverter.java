
public class TemperatureConverter {
	
	public String convertTemp(int temp, char convertTo) {
		
		double resCalculate = 0;
		switch(convertTo) {
			case 'C':
				resCalculate = (temp - 32) / 1.8000;
				break;
			case 'F':
				resCalculate = temp * 1.8000 + 32;
				break;
		}
		
		return String.valueOf(resCalculate);
		
	}
}
