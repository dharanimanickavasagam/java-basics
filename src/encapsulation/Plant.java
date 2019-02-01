package encapsulation;

public class Plant {
	private String name;
	public static final int ID =9; 

	public String getName() {
		return name+" " + riskme();
	}

	public void setName(String name) {
		this.name = name;
	} 
	
	private int riskme() { 
		return ID+1; 
	}
	
	
	
}
