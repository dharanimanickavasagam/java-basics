package inheritance;

public class Car extends Machine {
	public void gear() {
		System.out.println("Gear is applied");
	}

	@Override
	public void start() {
		// TODO Auto-generated method stub
		super.start();
		System.out.println("I can also do other things");
	}

	@Override
	public void displayName() {
		System.out.println("Name is "+visibleName);
		//System.out.println("Name is "+name); private variables are not visible inside me !
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		super.stop();
	}
}
