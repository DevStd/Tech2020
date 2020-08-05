package star;

public class Star02 {

	public static void main(String[] args) {
		// Print star - filled triangle shape by n
		// *****
		// ****
		// ***
		// **
		// *
		
		int n = 5;		
		printStar(n);
	}
	
	public static void printStar(int n) {
		//TODO: implement here
		for(int i = 0 ; i < n ; i++) {
			String line = "";
			for(int j = 0 ; j < n-i ; j++) {
				line += "*";
			}
			System.out.println(line);
		}
	}

}

