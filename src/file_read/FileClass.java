package file_read;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileClass {

	public static void main(String[] args) throws FileNotFoundException {

		File fileName = new File("C:\\Users\\Lakshmanan\\workspace\\Udemy _Java\\src\\file.txt");

		Scanner reader = new Scanner(fileName);

		int count = 1;
		String line = reader.nextLine();

		while (line != " ") {
			System.out.println(count + ": " + line);
			count++;
			if (reader.nextLine() != "")
			 line = reader.nextLine();
		}
		reader.close();
	}

}
