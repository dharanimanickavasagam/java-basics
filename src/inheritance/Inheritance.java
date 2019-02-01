package inheritance;

public class Inheritance {
	public static void main(String[] args) {
		System.out.println("Hi, I am from the Main class");
		System.out.println("Creating obj for Base class");
		Base baseObj = new Base();
		baseObj.getDisplay();
		System.out.println("**************");

		System.out.println("Creating obj for derived class");
		Derived derivedObj = new Derived();
		derivedObj.getDisplay();
		System.out.println("Accessing number from derived : " + derivedObj.number);
	}
}
