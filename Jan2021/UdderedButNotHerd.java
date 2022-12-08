package Jan2021;
import java.util.*;



public class UdderedButNotHerd {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); 
		
		String alpha = scan.next(); 
		String input = scan.next(); 
	
 
		alpha = alpha.toLowerCase(); 
		

		int counter = 0; 
		int i = 0; 
		
		while (i != input.length()) {
			
			
			for (int j = 0; j < alpha.length(); j ++) {
				
				if (i == input.length()) {
					break; 
				}
				
				if (alpha.substring(j, j + 1).equalsIgnoreCase(input.substring(i, i + 1))) {
					i++; 
	
										
				}	
			}
			counter++; 
		}
		
		System.out.println(counter);
		//jklmnopqabcdefghirstuvwxyz
	}
}



















		
//		System.out.println(counter);
//substring
//
//int counter = 0; 
//String store = ""; 
//
//for (int i = 0; i < input.length(); i++) {
//	
//	if (copy.contains(input.substring(i, i+1))) {
//	 
//	}
//	else if (alpha.contains(input.substring(i, i+1))) {
//		counter++; 
//		copy += input.substring(i, i +1); 
////		store = input.substring(i, i + 1); 
//	} 
//	
//}

		
