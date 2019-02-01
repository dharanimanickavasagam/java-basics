package file_write;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

// In try with resources br.close() is invoked automatically!
public class App {
	public static void main(String[] args) {
		try (BufferedWriter br = new BufferedWriter(new FileWriter("filewrite.txt"))) {
			String line = "hello ";
			br.write(line);
			br.write("Dharani here");
			br.newLine();
			br.write("Katheeek kicks like VJKanth");
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
