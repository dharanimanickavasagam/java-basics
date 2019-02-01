package static_final;

import java.util.Scanner;

class StaticMethodClass {
	public static int count = 0;
	public String name;
	public String course;

	public StaticMethodClass(String name, String course) {
		super();
		this.name = name;
		this.course = course;
		count++;
	}

	public StaticMethodClass() {
		// TODO Auto-generated constructor stub
	}

	public void getDetails() {
		System.out.println("Student name " + name);
		System.out.println("Branch is " + course);
		System.out.println("Count : " + count);
	}

	public int getCount() {
		return count;

	}
}

// NOTE : if there is a method that uses some data apart that works with data
// apart from Class variables, make the method static

// static variables and methods are available to any object of the class
// these var are initialized only once and retain data throught the objects

// static methods can only access static data, since they are common
// through the class
// and not available to instance variables , as they do not know what object can
// contain

// Member functions can access static and class variables + methods

public class StaticMethod {
	private static Scanner ui;
	private static Scanner no;

	public static void main(String[] args) {
		int n = 1;
		while (n == 1) {
			System.out.println("Enter student name and course");
			ui = new Scanner(System.in);
			String name = ui.next();
			String course = ui.next();
			StaticMethodClass smc = new StaticMethodClass(name, course);

			smc.getDetails();
			System.out.println("Enter 1 to continue ");
			no = new Scanner(System.in);
			n = ui.nextInt();

			System.out.println("---------------------------------------------");
		}
		StaticMethodClass smc1 = new StaticMethodClass();
		System.out.println("Number of records : " + smc1.getCount());
	}
}
