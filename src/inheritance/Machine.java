package inheritance;

public class Machine {
	private String name = "Machine";
	String visibleName = "Visible Machine"; 

	public void displayName() {
		System.out.println("Name is " + name);
	}

	public void start() {
		System.out.println("Started ");
	}

	public void stop() {
		System.out.println("Stoped ");
	}
}
