package star;

public class Star07 {

	public static void main(String[] args) {
		// Print star - onion shaped empty square by n
		// n = 5
		// *****
		// *   *
		// * * *
		// *   *
		// *****
		
		// n = 7
		// *******
		// *     *
		// * *** *
		// * * * *
		// * *** *
		// *     *
		// *******
		
		int n = 10;		
		printStar(n);
	}
	
	public static void printStar(int n) {
		//TODO: implement here
		boolean isOdd = (n%2 == 1);
		
		// 1. half of top
		int layer = 0;
		StringBuffer top = new StringBuffer();
		for(int i = 0 ; i < n/2 ; i++) {
			StringBuffer left = new StringBuffer();
			
			// layer left
			for(int j = 0 ; j < layer ; j++) left.append("* ");
			
			// draw left top
			for(int k = left.length() ; k < n/2 ; k++) {
				if(i%2 == 0) left.append("*");
				else left.append(" ");
			}
			
			// mirror left part ==> right part
			StringBuffer right = new StringBuffer(left).reverse();
			
			// (only odd case) set middle
			String center = "";
			if(isOdd) center = right.substring(0, 1);
			
			// merge into entire line
			top.append(left);
			top.append(center);
			top.append(right);
			top.append("\n");
			
			// check layer
			if(i%2 == 0) layer ++;
		}
		
		// 2. (only odd case) middle line
		StringBuffer middle = new StringBuffer();
		if(isOdd) {
			for(int i = 0 ; i < n ; i++) {
				if(i%2 == 0) middle.append("*");
				else middle.append(" ");
			}
			middle.append("\n");
		}
		
		// 3. half of bottom
		StringBuffer bottom = new StringBuffer(top).reverse();		
		
		// 4. to build whole figure
		top.append(middle);
		top.append(bottom.toString().trim());
		
		// 5. output
		System.out.println(top);
	}

}

