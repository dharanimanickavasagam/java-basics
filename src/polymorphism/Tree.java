package polymorphism;

public class Tree extends Plant {

	@Override
	public void grow() {
		System.out.println("Trees grow");
	}
	
	public void shedLeaves() { 
		System.out.println("Trees shed leaves ");
	}

}
