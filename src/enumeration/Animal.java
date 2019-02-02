package enumeration;

public enum Animal {
	// objects of the type animal
	// as there is no new to instantiate these objects , do assign the values
	// the obj may hold

	ELEPHANT("Bob"), FOX("Oswald"), GOAT("Merry"), HORSE("TOMMY"), IMPALA("INIDAN");
	String enumname;

	Animal(String enumname) {
		this.enumname = enumname;
	}

	public String getName() {
		return enumname;
	}

	public String toString() {
		return "This animal is called - " + enumname;
	}
}