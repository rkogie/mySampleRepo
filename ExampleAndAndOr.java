package day1.examples;

public class ExampleAndAndOr {

	public static void main(String[] args) {
		
		int x,y;
		x = 10;
		y = -10;
		
		if (x > 0 && y > 0) {
			System.out.println("Both are positive");
		}
		else if (x > 0 || y > 0) {
			System.out.println("At least one num is positive");
		}
		else {
			System.out.println("Both are negative");
		}
	
	}

}
