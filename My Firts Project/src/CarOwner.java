
public class CarOwner {

	public static void main(String[] args) {
		int distance = 0;
		int time = 2;
		Car myCar = new Car();
		myCar.start();
		distance = myCar.drive(time);
		System.out.println("Відстань "
		    + distance + " кілометрів авто проїхало за " + time + " години.");
		myCar.stop();
		
		Car jamescar = new JamesCar();
		jamescar.start();
		distance = jamescar.drive(time);
		System.out.println("Відстань "
		    + distance + " кілометрів авто проїхало за " + time + " години.");
		jamescar.stop();
	}

}
