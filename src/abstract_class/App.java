package abstract_class;

public class App {
	public static void main(String[] args) {

		Camera cam1 = new Camera();
		cam1.setId(1);

		Car car1 = new Car();
		car1.setId(2);
		car1.start();
		car1.run();

		// Cannot instantiate Machines as it is abstract
		// Machines mach1 = new Machines();

	}
}
