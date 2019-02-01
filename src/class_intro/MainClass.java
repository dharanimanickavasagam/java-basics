package class_intro;

public class MainClass {
	public static void main(String[] args) {
		Person person = new Person();
		person.setFname("Dharani");
		person.setLname("Manickavasagam");
		person.setAge(26);

		System.out.println("Name is " + person.getFname());
		System.out.println("Last name is " + person.getLname());
		System.out.println("Age is " + person.getAge());
		System.out.println("Stringified data " + person.toString());

		System.out.println("\nI am getting my details from a member function");
		Person person2 = new Person("Karthik", "Kuttybaby", 29);
		person2.getFullDetails();

	}
}
