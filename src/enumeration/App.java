package enumeration;

public class App {
	public static final int CAT = 0;
	public static final int DOG = 1;
	private static String name;
	private static String HORSE;

	public static void main(String[] args) {

		int animal = CAT;
		switch (animal) {
		case CAT:
			System.out.println("Cat : " + CAT);
			break;

		default:
			System.out.println("I am not there");
			break;
		}

		// Create a enum type file and its more easy to generate the switch case
		// statements automatically !

		Animal animalenum = Animal.FOX;

		switch (animalenum) {
		case ELEPHANT:
			System.out.println("ELEPHANT");
			break;

		case FOX:
			System.out.println("FOX : " + Animal.FOX);
			System.out.println("Name of the Fox is : " + Animal.FOX.getName());
			break;

		case GOAT:
			System.out.println("GOAT");
			break;

		case HORSE:
			System.out.println("HORSE");
			break;

		case IMPALA:
			System.out.println("IMPALA");
			break;

		default:
			System.out.println("none of the above");
			break;

		}

		// Following prints the class of the object anytime
		System.out.println("Class is : " + Animal.ELEPHANT.getClass());
		System.out.println("Is Elephant instance of the class Animal ?  " + (Animal.ELEPHANT instanceof Animal));

		// You cannot instantiate the enum Class or create more instances
		// anywhere
		// use of new is prohibited and the constructor is always private and
		// not public nor protected
		// Animal animal1 = new Animal();

		System.out.println(Animal.ELEPHANT.toString()+" \n");

		// Watch outs
		// Delete toString() and create a case

		System.out.println("Enum GOAT : " + Animal.GOAT);
		System.out.println("Name of the GOAT : " + (Animal.GOAT.enumname));

		// some default functions belonging to enum type
		System.out.println("GOAT : " + (Animal.GOAT.name()));
		// System.out.println("Name of the HORSE : " + (Animal.valueOf(HORSE)));

		Animal enumanimal = Animal.valueOf("IMPALA");
		System.out.println("IMPALA : " + enumanimal);

		System.out.println("HORSE : " + (Animal.valueOf("HORSE")));

	}

}
