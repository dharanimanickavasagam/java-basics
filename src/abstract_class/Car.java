package abstract_class;

public class Car extends Machines {

	@Override
	public void start() {
		System.out.println("Inside Car");
	}

	@Override
	public void stop() {
		System.out.println("Car stopped");

	}

	@Override
	public void gear() {
		System.out.println("Car geared");

	}

}
