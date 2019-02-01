package loops;

public class IfClass {
	public static void main(String[] args) {
		boolean cond = 1 < 4;
		System.out.println(cond);
		System.out.println(1 < 4);
		System.out.println(8 == 0);
		System.out.println(7 != 9);
		System.out.println("\nPrinting odd numbers ");
		for (int i = 0; i <= 10; i++) {
			if ((i % 5 == 0)) {
				System.out.println(i + " is multiple of 5");
			} else if (!(i % 5 == 0)) {
				System.out.println(i+ " is not multiple of 5");
				if ((!(i % 2 == 0))) {
					System.out.println("\t " + i+" is odd ");
				}
				else { 
					System.out.println("\t " +i+ " is even");
				}
			}

		}
	}
}
