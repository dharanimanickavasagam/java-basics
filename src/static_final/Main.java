package static_final;

public class Main {
	public static void main(String[] args) {
		StaticClass sfc1 = new StaticClass();
		StaticClass sfc2 = new StaticClass();
		
		sfc1.setName("dharani");
		System.out.println("Count : " +sfc1.returnCount());
		
		sfc2.setName("achu"); 
		System.out.println("Count : " +sfc2.returnCount());
	}

}

// static variables belong to the class, so these are class variables 
// they retain the value between the objects as they share the
// static variable with all other objects of the class