package Jan2021;
import java.util.Scanner;

public class COPYOFEVEN {
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); 
		
		int N = scan.nextInt(); 
		
		int[] id = new int[N]; 
		 
		int group = 0; 
		
		for (int k = 0; k < N; k ++) {
			id[k] = scan.nextInt(); 	
		}
		
		//GOOD
		
		int i = 0; 
		
		while (true) {
			
			if (group % 2 == 0) {
				
				int d = 0; 
				while(d < id.length) {
					if (id[d] % 2 == 0) {
						i = d + 1; 
						group++; 
						break; 
					}
					d++; 
				}
				
				
			} else {
				
			}
			
		
		}
		
	
		while (i < id.length - 1) {
			
			if (group % 2 == 0) { //even
															
				int sum = id[i] + id[i + 1]; 
				
				if (sum % 2 == 0) {
					group++; 
					i = i+2; 
										
				} 
				
				else {
					int sum2 = id[i] + id[i + 1]; 
					while (true) {
						if (sum2 % 2 == 0) {
							group++;
							i+=2; 
							break;
						}
						i++; 
						sum2 += id[i + 1]; 
						
					}
				}

				
				
			} else { //odd
	
					int sum = id[i] + id[i + 1]; 
					
					
					if (sum % 2 == 1) {
						group++; 
						i = i+2; 
						
						
						
					} else {
						int sum2 = id[i] + id[i + 1]; 
						while (true) {
							sum2 += id[i];
							if (sum2 % 2 == 1) {
								group++;
								i+=2; 
								break;
							}
							i++; 
							sum2 += id[i + 1]; 
						}
						
						
					}
					
									
					i++; 
				
			}
			
		
		}

		
		int store; 
		
		for (int i = 0; i < id.length; i ++) {
			
			if (id[i] % 2 == 0) {
				store = id[i]; 
			}
			
			if (group % 2 == 0) {
				if (id[i] % 2 == 0) {
				store = id[i]; 
				}
			} else {
				
			}
			
		}
		
		
		System.out.println(group);
			

		
		
	}


}
