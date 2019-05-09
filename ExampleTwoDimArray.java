package day1.examples;

public class ExampleTwoDimArray {

	public static void main(String[] args) {
		
		int[][] twoDimArr = new int[4][3];
// first box represents the ROW, 
// second box represents the COLUMN
		
		int temp = 10;
		
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 3; j++) {
				
		twoDimArr[i][j] = temp;
		temp += 10;
		System.out.print(twoDimArr[i][j] + " ");
			}
		System.out.println();	
		}
		
	}

}
