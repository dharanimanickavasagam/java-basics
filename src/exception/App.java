package exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import java.util.Scanner;

public class App {
	public static void main(String[] args) throws FileNotFoundException, Exception {
		int number = 8;
		try {
			number = number / 0;
		} catch (Exception e) {
			System.out.println(e + " is caught");
		}

		File file = new File("C:/Users/Lakshmanan/workspace/cave_of_pgm/src/exception/myfile");
		try {
			Scanner read = new Scanner(file);
			read.close();
		} catch (FileNotFoundException e) {

			System.out.println(e + "is caught");
		}

		FileReader fr = new FileReader("C:/Users/Lakshmanan/workspace/cave_of_pgm/src/exception/myfile");
		Scanner readerfr = new Scanner(fr);

		readerfr.close();

	}
}
