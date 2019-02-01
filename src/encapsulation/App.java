package encapsulation;

public class App {
	public static void main(String[] args) {
		Plant plant = new Plant(); 
		plant.setName("Anthurium");
		
		System.out.println(plant.getName()); 
		System.out.println(Plant.ID);
		
	}
}
