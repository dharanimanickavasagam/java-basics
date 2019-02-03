package serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Read {
	public static void main(String[] args) {
		System.out.println("Reading the objects");

		try (FileInputStream fi = new FileInputStream("object.bin")) {
			ObjectInputStream oi = new ObjectInputStream(fi);

			Person person1 = (Person) oi.readObject();
			Person person2 = (Person) oi.readObject();

			System.out.println(person1);
			System.out.println("------------------");
			System.out.println(person2);
			// oi.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
