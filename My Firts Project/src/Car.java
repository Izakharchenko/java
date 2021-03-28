
public class Car {
	public void start() {
		System.out.println("Двигун заведено!");
	}
	
	public void stop() {
		System.out.println("Двигун вимкнено.");
	}
	
	public int drive(int howlong) {
		int speed = 60;
		int distance = howlong * speed;
		return distance;
	}
}
