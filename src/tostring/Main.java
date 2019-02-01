package tostring;

public class Main {
	public static void main(String[] args) {
		// By default all the objects are derived from the class Obj
		// so they have some predefined methods, one of which is toString()
		// it returns the string representation of an obj, easy to debug
		Object obj = new Object();
		System.out.println(obj); // memory location of the obj 
		
		ToStringClass tsc =  new ToStringClass("Dharu", 26); 
		System.out.println(tsc);
		System.out.println("********************************");
		System.out.println(tsc.toString()); 
	}
}
