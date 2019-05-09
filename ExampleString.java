package day1.examples;

public class ExampleString {

	public static void main(String[] args) {
		
		String x = "James Gunn";
			System.out.println("Hello "+ x);
			System.out.println(x.toUpperCase());
			System.out.println(x.substring(2));
			System.out.println(x.substring(2,7));
			System.out.println(x.substring(2));
			
			String age = "37";
			String salary = "78965.83";
			//wrapper classes to convert strings to numbers
			
			int a = Integer.parseInt(age)%2;
			System.out.println(a);
			
			double b = Double.parseDouble(salary) * 0.15;
			System.out.println(b);
	}
	
	

}
