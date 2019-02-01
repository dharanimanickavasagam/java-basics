package casting;

public class CastNumbers {

	public static void main(String[] args) {
		byte byteVal = 24;
		int intVal = 888;
		long longVal = 228;

		float floatVal = 34.89f;
		double doubleVal = 84535.9;

		// cannot convert from higher to lower configuration
		// intVal = longVal;
		// Possible
		// longVal = intVal;

		// To cast, do the below
		intVal = (int) longVal;
		System.out.println(Math.round(intVal));

		// After point will be chopped off in double and float
		intVal = (int) doubleVal;
		System.out.println(Math.round(intVal));

		intVal = (int) floatVal;
		System.out.println(intVal);

		// but no change when you convert int to double or float as it appends
		// only decimal point and some trailing zeroes

		doubleVal = intVal;
		System.out.println(doubleVal);

		floatVal = intVal;
		System.out.println(floatVal);

		byteVal = (byte) 128;
		System.out.println(byteVal);

	}
}
