package exception_try_resources;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Application {

	public static void main(String[] args) {

		try (BufferedReader br = new BufferedReader(
				new FileReader("C:/Users/Lakshmanan/workspace/cave_of_pgm/src/exception_try_resources/myfile"))) {
			String line;
			line = br.readLine();

			while (line != null) {
				System.out.println(line);
				line = br.readLine();
			}
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (IOException e1) {
			System.out.println(e1.getMessage());
		}
	}

}