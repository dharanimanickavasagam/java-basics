package serialization;
import java.io.Serializable;

public class Person implements Serializable {

	private static final long serialVersionUID = 1613555224584004025L;

	//some random number is generated which is mainly used to de-serialize the objects 
	// if you change the ID and do the reading you may encounter an error 
	// you must always read with the same serial version UID  

	
	private int id;
	private String name;

	public Person(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public String toString() {
		return "Person id :" + id + "\nName : " + name;
	}

}
