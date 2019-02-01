package exception_multiple;

import java.io.IOException;
import java.text.ParseException;

public class Test {
	private int number; 
	
	public void setNumber(int number) {
		this.number = number;
	}
	
	public void run() throws IOException, MyException, ParseException {
		if(number == 0) { 
				throw new IOException("IO Exception encountered");
		} 
		else if(number == 1) { 
			throw new MyException("Custom Exception"); 
		}
		else if(number ==2 ) { 
			throw new ParseException("Just like that", 2); 
		}
		System.out.println("I am running ");
	}
}
