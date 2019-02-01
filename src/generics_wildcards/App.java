package generics_wildcards;

import java.util.ArrayList;

class Machine {
	public int ID = 3;

	@Override
	public String toString() {
		return "I am a machine";
	}

	public void start() {
		System.out.println("Machine started");
	}
}

class Camera extends Machine {

	@Override
	public String toString() {
		return "I am a Camera";
	}

	public void snap() {
		System.out.println("Photo taken");
	}

}

public class App {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("hi");
		list.add("hello");

		showList(list);
		System.out.println("-----------------------------------");

		// class type objects
		Machine machineobj = new Machine();
		ArrayList<Machine> list1 = new ArrayList<>();
		list1.add(machineobj);
		list1.add(new Machine());
		showClassObjectListMachine(list1);
		System.out.println("-----------------------------------");
		showClassObjectList(list1);
		System.out.println("-----------------------------------");

		// Derived class objects
		Camera cameraobj = new Camera();
		ArrayList<Camera> list2 = new ArrayList<>();
		list2.add(cameraobj);
		list2.add(new Camera());
		showClassObjectListCamera(list2);
		System.out.println("-----------------------------------");

		showClassObjectList(list2);
		System.out.println("-----------------------------------\nNormal String ArrayList");

		showClassObjectList(list);
		System.out.println("-----------------------------------\nFrom Machine");

		showClassObjectSpecificList(list1);
		System.out.println("-----------------------------------\nFrom Camera");

		showClassObjectSpecificList(list2);
		System.out.println("-----------------------------------\nLower Bound");
		showClassObjectSpecificListCamera(list2); 

	}

	public static void showList(ArrayList<String> list) {
		for (String i : list) {
			System.out.println(i);
		}
	}

	private static void showClassObjectListCamera(ArrayList<Camera> list1) {
		for (Machine i : list1) {
			System.out.println("ID is " + i.ID);
		}
	}

	// Although Machine is the base class of Camera
	// ArrayList of type Machine cannot handle Camera
	// So define the methods separate
	private static void showClassObjectListMachine(ArrayList<Machine> list1) {
		for (Machine i : list1) {
			System.out.println("ID is " + i.ID);
		}
	}

	// To handle any type of class type use wild card character '?'
	// Object is the universal parent of all object
	private static void showClassObjectList(ArrayList<?> list1) {
		for (Object i : list1) {
			System.out.println(i);
		}
	}

	// To know if the class type extends Machine or subclass of Machine, this is
	// an upper bound
	private static void showClassObjectSpecificList(ArrayList<? extends Machine> list1) {
		for (Machine i : list1) {
			System.out.println("ID is " + i.ID);
			i.start();
		}
	}

	// This is a lower bound , this should be Camera or super class of Camera
	private static void showClassObjectSpecificListCamera(ArrayList<? super Camera> list2) {
		for (Object i : list2) {
			System.out.println(i);
		}
	}

}
