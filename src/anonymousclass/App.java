package anonymousclass;

class Machine {
	public void start() {
		System.out.println("Starting Machine");
	}
}

interface Plant {
	public void grow();
}

public class App {
	public static void main(String[] args) {
		// calling start() with a reference variable machine
		Machine machine = new Machine();
		machine.start();
		System.out.println(machine.getClass() + "\n");

		// not using any reference variables to call start()
		new Machine().start();
		System.out.println(new Machine().getClass() + "\n");

		// this is an anonymous Class, this is not Machine
		// no way to create new object for these classes
		// needs redefinition
		Machine machine1 = new Machine() {
			@Override
			public void start() {
				System.out.println("Hello from the overridden method!");
			}
		};
		machine1.start();
		System.out.println(machine1.getClass() + "\n");

		// to create objects for interface use the same method
		// Cannot create objects for interface
		// Plant plant = new Plant();
		
		Plant plant = new Plant() {
			@Override
			public void grow() {
				System.out.println("I grow");
			}
		};
		System.out.println("Type of plant is " + plant.getClass());

		System.out.println("Calling the interface method from interface object");
		plant.grow();
	}
}
