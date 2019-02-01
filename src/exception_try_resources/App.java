package exception_try_resources;
// java 7 implementation 

// AutoCloseable is an interface that specifies that the interface should have a close() 
class Temp implements AutoCloseable {

	@Override
	public void close() throws Exception {
		System.out.println("I print closing!");
	}

}

public class App {
	public static void main(String[] args) {
		try (Temp temp = new Temp()) {
			System.out.println("I am calling close() automatically");
			temp.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
