package abstract_class;

public class Camera extends Machines{

	@Override
	public void start() {
		System.out.println("Camera started");
	}

	@Override
	public void stop() {
		System.out.println("Camera stopped");
		
	}

	@Override
	public void gear() {
		System.out.println("Camera geared");
		
	}

}
