
public class Pet {
    int age;
    float weight;
    float heigth;
    String color;
    
    public void sleep() {
    	System.out.println("На добраніч, до завтра");
    }
    
    public void eat() {
    	System.out.println("Я дуже голодний, давай перекусимо чіпсами!");
    }
    
    public String say(String aWord) {
    	String petResponse = "Ну гаразд!! " + aWord;
    	return petResponse;
    }
}
