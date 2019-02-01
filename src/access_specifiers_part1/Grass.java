package access_specifiers_part1;

import acess_specifiers_part2.Plant;

public class Grass extends Plant {
	public Grass() {
		// height is not visible because, the base class and derived class are
		// in different packages
		
		// height = 1;
	}
}
