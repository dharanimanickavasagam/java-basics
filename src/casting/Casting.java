package casting;

class Machine {
	public void start() {
		System.out.println("Machine started");
	}

	public void stop() {
		System.out.println("Machine stopped");
	}
}

class Camera extends Machine {
	public void start() {
		System.out.println("Camera started");
	}

	public void snap() {
		System.out.println("Photo taken");
	}
}

public class Casting {

	public static void main(String[] args) {
		Machine mach1 = new Machine();
		Camera cam1 = new Camera();

		mach1.start();
		cam1.start();
		cam1.snap();

		System.out.println("**********************\nUP-CASTING");
		// Upcasting..
		// Sub class reference to Base class
		mach1 = cam1;
		mach1.start();
		mach1.stop();
		System.out.println("**********************\nDOWN-CASTING");

		// Downcasting..
		// java needs confirmation to downcast, so define the type to be
		// downcasted
		cam1 = (Camera) mach1;
		cam1.start();
		cam1.snap();
		System.out.println("**********************");
		mach1.start();
		mach1.stop();

		// some trying
		System.out.println("**********************");
		// Machine mach2 = new Machine();
		// Camera cam2 = new Camera();

		Machine mach3 = new Camera();
		mach3.start();

		System.out.println("**********************");
		// It shows run time error, why ?
		// cam2 = (Camera)mach2 ;
		// cam2.snap();
		// cam2.start();
		// cam2.stop();

		// Down-casting is unsafe
		Machine machine4 = new Machine();
		Camera camera3 = (Camera) machine4;
		camera3.start();
		camera3.snap();

	}

}
