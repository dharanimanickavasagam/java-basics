package static_final;

public class StaticClass {
	public String name;
	public static int count = 0;

	public StaticClass() {
		count++;
	}
	
	public void setName(String name) {
		this.name = name;
		count++;
	}
	
	public int returnCount(){ 
		count++;
		return count; 
	}
	
}
