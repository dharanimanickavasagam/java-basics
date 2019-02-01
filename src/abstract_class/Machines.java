package abstract_class;
// Base class does not do anything 

// only contains info that is derived 
// so use of objects to abstract is restricted 

public abstract class Machines {
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	// Not abstract as it does not have the keyword abstract
	// public void start();

	public abstract void start();

	public abstract void stop();

	public abstract void gear();

	public void run() {
		start();
		stop();
		gear();
		System.out.println("Machines run");
		int number = 9;
		number = number + 89;
		System.out.println(number);
	}

}

// Abstract class VS Interface
// A class can have multiple interfaces but extend only one abstract class
// It needs to be extended and its abstract methods implemented
// It cannot be instantiated
// Can have constructors and static methods
// It can have final methods also
// If there is an abstract method in a class, that class must be abstract.

// Abstract class can have
// 1.Abs methods - does not allow definition so make declarations alone example:
// start(),stop(),gear())
// 2.Non Abs Methods - Allows definition and declaration (example : run())
