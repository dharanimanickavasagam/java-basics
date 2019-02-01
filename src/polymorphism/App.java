package polymorphism;

public class App {
	public static void main(String[] args) {
		Plant plant1 = new Plant();
		Tree tree1 = new Tree();

		// plant1,plant2 are references to plant object
		Plant plant2 = plant1;

		// this is Polymorphism, Tree extends Plant
		Plant plant3 = tree1;

		// normal method invocation with the obj of same class type
		plant1.grow();
		tree1.grow();
		System.out.println("********************************");
		// polymorphed results, what matters is the actual type of object
		plant2.grow();
		plant3.grow();
		System.out.println("********************************");
		// the below will not work, since PLant does not extend App
		// Plant shld know App type
		// App app = new Plant();

		tree1.shedLeaves();

		// ShedLeaves() is a method of Tree and not Plant
		// type of the variable decides the method you can call

		// so create a shedLeaves() in Plant and then call. Upon calling it
		// calls the Tree method and not Plant
		plant3.shedLeaves();
		plant1.shedLeaves(); 
		System.out.println("*************************************");
		
		appGrow(tree1);
		
	}
	
	public static void appGrow(Plant plant) { 
		plant.grow(); 
	}
}
