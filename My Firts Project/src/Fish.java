
public class Fish extends Pet {
    int currentDepth = 0;
    
    public int dive(int howDeep) {
    	currentDepth += howDeep;
    	System.out.println("Я занурююсь на глибину " + howDeep + " фута");
    	System.out.println("Я на глибині " + currentDepth + " футів нижче за рівень моря.");
    	return currentDepth;
    }
    public String say(String something) {
    	return "Ти, що не знаєш, що риби не розмовляють!";
    }
}
