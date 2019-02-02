package innerclass;

public class App {
	public static void main(String[] args) {
		Robot robot = new Robot(5);
		robot.start();

		System.out.println("\nNon static innerclass ");
		// not the most used way to access a method of an inner class
		Robot.Brain brain = robot.new Brain();
		brain.think();

		// another way of creating a Brain object
		Robot.Brain brain1 = new Robot(5).new Brain();
		brain1.think();

		System.out.println("\nStatic innerclass ");
		Robot.Battery battery = new Robot.Battery();
		battery.charge();
	}
}
