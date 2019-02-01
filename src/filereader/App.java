package filereader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class App {
	public static void main(String[] args) {
		FileReader fr = null;
		BufferedReader br = null;
		try {
			fr = new FileReader("C:/Users/Lakshmanan/workspace/cave_of_pgm/src/filereader/filedemo");
			br = new BufferedReader(fr);

			try {
				String line = br.readLine();

				while (line != null) {
					System.out.println(line);
					line = br.readLine();
				}

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} catch (FileNotFoundException e) {
			System.out.println("File not found");
		}
		try {
			br.close();
		} catch (IOException e) {
			System.out.println("Cannot close file :/ ");
		}
	}
}
