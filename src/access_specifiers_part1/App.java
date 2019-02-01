package access_specifiers_part1;

import acess_specifiers_part2.*;

// private - class 
// public - class + subclass + package + world 
// protected - class + subclass + package
// default - class + sub class in same package + package 

// You cannot have a private class but can have any number of default modifier classes in the same file 

public class App {
	public static void main(String[] args) {
		Plant plant = new Plant();

		// Below is a bad practice, as it exposes the variable
		System.out.println("Name is " + plant.name);

		// good practice is by making it private and accessing it by member
		// functions
		System.out.println("Family is " + plant.getFamily());

		// good practice is to make the constant(final) variables public as it
		// cannot
		// be modified though known
		System.out.println("ID is " + Plant.ID);
		System.out.println("Plant size is " + plant.getSize());

		// Now not in the same package, so its not visible
		// System.out.println(plant.size);

		Oak oak = new Oak();
		System.out.println("Family is " + oak.getFamily());
		oak.showSize();

		Field field = new Field();
		field.showFamily();
	}

}
