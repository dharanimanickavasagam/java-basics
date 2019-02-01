package stringbuilder;

public class Main {
	public static void main(String[] args) {

		// immutable string object
		String hi = "Hello,";
		hi += "Hey there";
		hi += ".Glad to see you" + ".I am immutable";
		System.out.println(hi);

		// Mutable string array
		StringBuilder sb = new StringBuilder("Dharani, ");
		sb.append("hi ");
		sb.append("hi there");
		sb.append(".I am mutable array of strings");
		sb.append(".I am efficient");
		System.out.println(sb);

		// chaining
		StringBuilder sb1 = new StringBuilder("Dharani, ");
		sb1.append("hi ").append("hi there").append(".I am mutable array of strings").append(".I am efficient");
		System.out.println(sb1);
		
		// Formatting display for integers 
		System.out.printf("%d,Hello\n",5);
		System.out.printf("%5d,Hello\n",1);
		System.out.printf("%-5d,Hello\n\n",3);
		System.out.println(" ");
		
		
		//Formatting display of floating points
		System.out.printf("%f,Hi there!\n",5.18);
		System.out.printf("%.1f,Hi there!\n",5.18);
		System.out.printf("%5.1f,Hi there!\n",5.18);
		System.out.printf("%-5.1f,Hi there!",5.18);
	}

}
