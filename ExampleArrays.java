package day1.examples;

public class ExampleArrays {

	public static void main(String[] args) {
		int[] array = {10, 20, 30, 40, 50};
			//System.out.println(array [2] + "\n" + array [4]);
		
			
		//enhanced for loop to print out all data types in a primitive array
		  for(int temp: array) {
		 	//System.out.println(temp);
	}
		
	 	int[] x = new int[5];
	 	x[3] = 25;
	 	x[0] = 12;
	 	
	 for(int temp2: x) {
			//System.out.println(temp2);
		
	 }
		
	 String[] st = {"one", "two", "three"};
	 for(String temp3: st) {
			//System.out.println(temp3);
	 }
	 
	 String[] stx = new String[5];
	 	stx[3] = "25";
	 	stx[0] = "12";
	 for(String temp4: stx) {
			//System.out.println(temp4);
	}
}
}
