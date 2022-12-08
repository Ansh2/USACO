package Jan2021;
import java.util.*; 

public class EvenMoreOddPhotos {

	private static int[] bowl; 
	
	
	public static boolean doesContainEven() {
	
		for (int i = 0; i < bowl.length; i++) {
			if (bowl[i] %2 == 0) {
				return true; 
			}
		}
		return false; 
		
	}
	
	public static boolean doesContainOdd() {
		
		for (int i = 0; i < bowl.length; i++) {
			if (bowl[i] % 2 == 0) {
				return true; 
			}
		}
		return false; 
		
	}
	
	public static void delete(int index) { // mutator
		
		int eindex = -1; 
		
		
		
		for (int i = 0; i < bowl.length; i++) {
			if (bowl[i] == index) {
				eindex = i; 
			}
		}
				
		
		for (int i = eindex; i < bowl.length - 1; i++) { //overwriting the values to shift them 
			bowl[i] = bowl[i + 1]; 
		}
		int[] arr = new int[bowl.length - 1]; 
		
		
		for (int i = 0; i < arr.length; i ++) {
			arr[i] = bowl[i]; 
		}
		
		bowl = arr; 
		
	}

	
	
	
	
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in); 
		
		int N = scan.nextInt(); 
		
		bowl = new int[N]; 
		 
		int group = 0; 
		
		for (int k = 0; k < N; k ++) {
			bowl[k] = scan.nextInt(); 	
		}
		
		
		//GOOD
		
		int i = 0; 
	
		while (i < bowl.length - 1) {
			
			if (group % 2 == 0) { //even
				
				

				if (doesContainEven() == true) {
					for (int k = 0; k < bowl.length; k++) {
						if (bowl[k] % 2 == 0) {
//							delete(bowl[k]); 
							int temp = bowl[group -1];
							bowl[group - 1] = bowl[k]; 
							bowl[k] = temp; 
							group++; 
						}
					}
				
				} else {
					int sum = bowl[i] + bowl[i + 1]; 
	
				
					if (sum % 2 == 0) {
						group++; 
						i = i+2; 
										
					} else {
						int sum2 = bowl[i] + bowl[i + 1]; 
						while (true) {
							if (sum2 % 2 == 0) {
								group++;
								i+=2; 
								break;
							}
							i++; 
							sum2 += bowl[i + 1]; 
							
						}
					}

				}
				
			} else { //odd
				
				if (doesContainOdd() == true) {
					
					for (int k = 0; k < bowl.length; k++) {
						if (bowl[k] % 2 == 1) {
//							delete(bowl[k]); 
							int temp = bowl[group -1];
							bowl[group - 1] = bowl[k]; 
							bowl[k] = temp; 
							group++; 
						}
					}
				} else {
					
	
					int sum = bowl[i] + bowl[i + 1]; 
					
					
					if (sum % 2 == 1) {
						group++; 
						i = i+2; 
						
						
						
					} else {
						int sum2 = bowl[i] + bowl[i + 1]; 
						while (true) {
							sum2 += bowl[i];
							if (sum2 % 2 == 1) {
								group++;
								i+=2; 
								break;
							}
							i++; 
							sum2 += bowl[i + 1]; 
						}
						
						
					}
					
									
					i++; 
				
			}
				}
			
		
		}
			
		
		System.out.println(group);
			

		
		
	}

}


//
//if (id[i] + id[i + 1] % 2 == 1) {
//	group++; 
//					
//} else {
//	while () {
//		
//	}
//}


//System.out.println(group);

