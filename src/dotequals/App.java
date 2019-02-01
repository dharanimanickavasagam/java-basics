package dotequals;

public class App {
	public static void main(String[] args) {
		Person person1 = new Person(1, "Dharu");
		Person person2 = new Person(2, "Katheek");
		System.out.println(person1 + "\n" + person2);

		// this is false because they are different objects of same type
		// == tells whether 2 references are pointing to same object or not
		System.out.println("Are we same ? " + (person1 == person2));

		// now they point to the same object
		person1 = person2;
		System.out.println("Are we same ? " + (person1 == person2));

		// still return false as they are different objects
		// but semantically the same
		System.out.println("\nSame values in different objects ");
		Person person3 = new Person(1, "Dharu");
		Person person4 = new Person(1, "Dharu");
		System.out.println("Are we same ? " + (person3 == person4));

		// dot equals checks for the semantic equality between the objects
		// still shows false because .equals does not know how to compare
		// so override .equals and implement

		System.out.println("Are we same ? " + (person3.equals(person4)));

		Double value1 = 3.14;
		Double value2 = 3.14;
		System.out.println("\nDoubles\nAre doubles same ? " + (value1 == value2));
		System.out.println("Are doubles same ? " + (value1.equals(value2)));

		Integer val1 = 5;
		Integer val2 = 5;
		System.out.println("\nIntegers\nAre integers same ? " + (val1 == val2));
		System.out.println("Are integers same ? " + (val1.equals(val2)));

		String text1 = "hello";
		String text2 = "hello";
		System.out.println("\nStrings\nAre Strings same ? " + (text1 == text2));
		System.out.println("Are Strings same ? " + (text1.equals(text2)));

		String text3 = "hello";
		String text4 = "hellodhaaru".substring(0, 5);

		// refs point to two different objects in memory
		// always compare Strings semantically, applies to double also
		System.out.println("\nStrings\nAre Strings same ? " + (text3 == text4));
		System.out.println("Are Strings same ? " + (text3.equals(text4)));
	}
}
