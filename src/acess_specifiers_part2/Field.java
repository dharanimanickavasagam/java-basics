package acess_specifiers_part2;
// this class does not extend Plant 

// this is in the same package as Plant
// as Plant is a public class, we can create object to it 
// and can access the instance variables 

public class Field {
	Plant plant = new Plant();
	String family;

	public Field() {
		// size is visible in - Base Class + Derived Class + Package
		plant.size = "very huge";
		plant.height = 30;
		family = plant.getFamily();
	}

	public void showFamily() {
		System.out.println("Family is " + family);
	}

}
