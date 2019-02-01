package file_read;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class App {
	public static void main(String[] args) throws FileNotFoundException {
		String fileName = "C:/Users/Lakshmanan/workspace/cave_of_pgm/src/readingfiles/myfile";

		// create file object
		File textFile = new File(fileName);

		Scanner in = new Scanner(textFile);
		while (in.hasNextLine()) {
			System.out.println(in.nextLine());
		}
		in.close();
	}
}
