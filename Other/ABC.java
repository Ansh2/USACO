package Other;
import java.util.Arrays;
import java.util.Scanner; 

public class ABC {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] arr = new int[7]; 
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt(); 
		}
		
		int a = arr[0]; 
		int abc = arr[0]; 
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > abc) {
				abc = arr[i]; 
			} 
			if (arr[i] < a) {
				a = arr[i];  
			}
		}

		//breaks do not work on for loops

		int b = arr[0]; 
		
		for (int i = 0; i < arr.length; i++) {
			if (b >= arr[i] && arr[i] != a) {
				b = arr[i]; 
			}
		}
		
		int c = abc - (a + b);
		
		
		System.out.println(a + " " + b + " " + c);
		
	}
}
