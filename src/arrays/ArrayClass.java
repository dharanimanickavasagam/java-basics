package arrays;

public class ArrayClass {
	public static void main(String[] args) {
		int[] array = new int[5]; // arrays are reference variables
		array[3] = 57;
		array[4] = 788;

		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}

		System.out.println("----------------");

		for (int i : array) {
			System.out.println(i);
		}
		System.out.println("----------------");
		// length property
		String[] names = { "dharu", "achu", "karthik" };
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
		System.out.println("----------------");
		for (String i : names) {
			System.out.println(i);
		}
	}
}
