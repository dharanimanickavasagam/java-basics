package innerclass;

public class Robot {
	private int id;

	public Robot(int id) {
		super();
		this.id = id;
	}

	public void start() {
		System.out.println("Starting robot " + id);

		Brain brain = new Brain();
		brain.think();

		Battery battery = new Battery();
		battery.charge();

		// It is possible to create a new class within a member function
		// It again behaves like a normal inner class
		// It can access outer's IV + MF

		String name = "Dharu";

		// Scope of the below class is limited to the method start()
		// It can no way accessed by the outer means!
		class Temp {
			public void doSomething() {
				System.out.println("\nInner Class within a method \nId is " + id + ", Name is " + name);
			}
		}

		Temp temp = new Temp();
		temp.doSomething();
	}

	public void stop() {
		System.out.println("Robot stoppped");
	}

	// Nested classes or inner classes are capable of accessing the outer
	// class's instance variables and member functions

	// Inner classes are not visible outside the outer class, so add the access
	// specifier public to it

	public class Brain {
		public void think() {
			System.out.println("Inner class : Robot " + id + " is thinking");
			System.out.print("Calling method of the outer class : ");
			stop();
		}
	}

	// Static inner classes cannot access the outer class instance variables and
	// member methods
	// static class can only handle static variables + static methods
	// It is used for some kind of common grouping

	static class Battery {
		String type = "New";

		public void charge() {
			System.out.println("Static inner-class :  " + type + " Battery Charging");
		}
	}

}
