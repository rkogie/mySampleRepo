package day1.examples;

import java.util.Scanner;

public class ExampleApples {

	public static void main(String[] args) {

		Scanner userIn = new Scanner(System.in);
		ExampleTuna tunaObject  = new ExampleTuna();
		
		System.out.println("Enter your name below:");
		String name  = userIn.nextLine();
		userIn.close();
		
		tunaObject.simpleMessage(name);
		
	}

}
