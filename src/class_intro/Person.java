package class_intro;

public class Person {
	String fname, lname; // instance variables that represents the state of an
							// object
	int age;

	public Person() { 
	
	}

	public Person(String fname, String lname, int age) {
		this.fname = fname;
		this.lname = lname;
		this.age = age;
	}

	public String getFname() { // member functions that work over instance
								// variables
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void getFullDetails() {
		System.out.println("Name is " + fname);
		System.out.println("Last Name is " + lname);
		System.out.println("Age is " + age);
	}

}
