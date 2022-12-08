package Jan2021;
import java.util.*; 

public class JustStalling {
	
	
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in); 
		
		int cows = scan.nextInt(); 
		
		int[] id = new int[cows]; 
		
		int[] heights = new int[cows]; 
		
		for (int i = 0; i < id.length; i ++) {
		
			id[i] = scan.nextInt(); 
			
		}
		
		
		for (int i = 0; i < heights.length;  i++) {
		
			heights[i] = scan.nextInt(); 
	
		}
	
		System.out.println(cows * 2);
		
		
		
	}

}
