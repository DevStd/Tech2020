package star;

public class Star01 {

	public static void main(String[] args) {
		// Print star - filled squared shape by n
		// *****
		// *****
		// *****
		// *****
		// *****
		
		int n = 5;		
		printStar(n);
	}
	
	public static void printStar(int n) {
		//TODO: implement here
		for(int i = 0 ; i < n ; i++) {
			String line = "";
			for(int j = 0 ; j < n ; j++) {
				line += "*";
			}
			System.out.println(line);
		}
	}

}

