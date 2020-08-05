package star;

public class Star06 {

	public static void main(String[] args) {
		// Print star - empty triangle shape by n
		// *
		// **
		// * *
		// *  *
		// *   *
		// ******
		
		int n = 6;		
		printStar(n);
	}
	
	public static void printStar(int n) {
		//TODO: implement here
		for(int i = 0 ; i < n ; i++) {
			String line = "";
			for(int j = 0; j < i+1 ; j++) {
				if(j == 0 || i == n-1 || i == j ) line += "*";
				else line += " ";
			}
			System.out.println(line);
		}
	}

}

