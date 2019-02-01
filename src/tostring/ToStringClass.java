package tostring;

public class ToStringClass {
	int age;
	String name;

	public ToStringClass(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// toString() cannot return anything from String
	// if this method is not defined, it returns hashcode of the object
	// if this is defined, you can customize what to return

	public String toString() {
		StringBuilder sb = new StringBuilder("Name is " + name).append(", Age is ").append(age);
		return sb.toString();

		// the below code returns the String rep of obj values
		// its inefficient since it concatenates
		// use StringBuilder for mutable strings arrays
		// return name+","+ age;
	}

}
