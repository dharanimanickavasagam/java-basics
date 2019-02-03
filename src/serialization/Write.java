package serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Write {
	public static void main(String[] args) {
		System.out.println("Writing objects . . .");

		Person person1 = new Person(7, "dhaaru");
		Person person2 = new Person(4, "katheek");

		System.out.println(person1);
		System.out.println(person2);

		// try with resources call op.close() automatically !!!!

		try (FileOutputStream fs = new FileOutputStream("object.bin")) {
			ObjectOutputStream os = new ObjectOutputStream(fs);
			os.writeObject(person1);
			os.writeObject(person2);
			// os.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}