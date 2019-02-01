package inheritance;

public class App {
	public static void main(String[] args) {
		Machine mach1 = new Machine();
		System.out.println("Calling from Machine");
		mach1.start();
		mach1.stop();
		mach1.displayName();
		// System.out.println(mach1.name); (It is not visible outside the class)
		System.out.println("****************************");

		Car car1 = new Car();
		System.out.println("Calling from Car");
		car1.start();
		car1.gear();
		car1.displayName();
	}
}
