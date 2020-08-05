package star;

public class Star05 {

	public static void main(String[] args) {
		// Print star - empty squared shape by n
		// *****
		// *   *
		// *   *
		// *   *
		// *****
		
		int n = 5;		
		printStar(n);
	}
	
	public static void printStar(int n) {
		//TODO: implement here
		for(int i = 0 ; i < n ; i++) {
			String line = "";
			for(int j = 0 ; j < n ; j++) {
				if(i == 0 || i == n-1 || j == 0 || j == n-1) line += "*";
				else line += " ";
			}
			System.out.println(line);
		}
	}

}

