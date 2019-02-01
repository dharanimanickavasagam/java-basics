package exception_custom;

import java.io.IOException;

class Test {
	public void run() throws IOException, ServerException {
		int code = 0;

		if (code == 0) {
			// throw new IOException("Something went wrong!");
			throw new ServerException("Server Error");

			// System.out.println("I am not given control at all");
		}

		System.out.println("I am running ");
	}
}

public class ThrowsException {
	public static void main(String[] args) {
		Test test = new Test();
		try {
			try {
				test.run();
			} catch (ServerException e) {
				System.out.println(e.getMessage());
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
