package arrays;

public class MultiDimensionalArray {
	public static void main(String[] args) {
		int[][] inputArray = { { 1, 2, 3 }, { 4, 5, 6, 7, 8 } };

		System.out.println(inputArray[0][1]);
		System.out.println(inputArray[1][3]);

		String[][] stringArray = new String[2][3];
		stringArray[0][2] = "dharu";
		stringArray[1][2] = "karthik";

		System.out.println("Printing Values");
		System.out.println(stringArray.length);

		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {

				System.out.println(stringArray[i][j]);
			}
		}
	}

}
