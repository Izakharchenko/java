
public class Fish extends Pet {
    int currentDepth;
    
    Fish(int currentDepth) {
    	this.currentDepth = currentDepth;
    }
    
    public int dive(int howDeep) {
    	currentDepth += howDeep;
    	
    	if (currentDepth > 100) {
    		System.out.println("Я маленька рибка і не можу плавти глибше 100 метрів");
    		currentDepth = currentDepth - howDeep;
    	} else {
    		System.out.println("Я занурююсь на глибину " + howDeep + " метра");
    		System.out.println("Я на глибині " + currentDepth + " метри нижче за рівень моря.");
    	}
    	return currentDepth;
    }
    public String say(String something) {
    	return "Ти, що не знаєш, що риби не розмовляють!";
    }
}
