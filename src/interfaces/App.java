package interfaces;

public class App {
	public static void main(String[] args) {
		Machine mach1 = new Machine();
		mach1.start();
		mach1.showInfo();
		System.out.println("************************");

		Person person1 = new Person("dharani");
		person1.greet();
		person1.showInfo();
		System.out.println("************************");

		Info info = new Machine();
		info.showInfo();
		System.out.println("************************");

		Info info1 = person1;
		info1.showInfo();
		System.out.println("************************");

		outputInfo(new Machine());
		outputInfo(new Person("Karthik"));

		// Info info2 = new App();
		// Above is not possible because App does not implement Info
	}

	// static methods need no objects to call
	// App class does not have any object defined, so define a static method to
	// invoke from the class
	private static void outputInfo(Info info) {
		info.showInfo();
	}

}
