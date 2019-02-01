package exception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class exceptionfrommethod {
	public static void main(String[] args) throws FileNotFoundException {
		openFile();
	}

	private static void openFile() throws FileNotFoundException {
		FileReader reader = new FileReader("C:/Users/Lakshmanan/workspace/cave_of_pgm/src/exception/myfile");
		Scanner in = new Scanner(reader);
		while (in.hasNextLine()) {
			System.out.println(in.nextLine());
		}
		in.close();
	}
}
