package acess_specifiers_part2;

public class Oak extends Plant {
	String type;

	public Oak() {
		// family is private and not visible
		// type = family;

		// protected,visible only in the inherited classes
		this.size = "huge";

		// default is visible in Base + Derived in same Package + Package
		this.height = 20;
	}

	public void showSize() {
		System.out.println("Size of Oak is " + size);
	}
}
