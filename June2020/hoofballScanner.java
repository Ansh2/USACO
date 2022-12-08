package June2020;
import java.util.Arrays;
import java.util.Scanner;

public class hoofballScanner {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int cows = scan.nextInt();
		
		int min = 1; 
		
		int[] arr = new int[cows]; 
		for (int i = 0; i < cows; i++) {
			arr[i] = scan.nextInt(); 
			
		}
		 int n = arr.length;
	        for (int i = 0; i < n-1; i++)
	            for (int j = 0; j < n-i-1; j++)
	                if (arr[j] > arr[j+1])
	                {
	                    // swap temp and arr[i]
	                    int temp = arr[j];
	                    arr[j] = arr[j+1];
	                    arr[j+1] = temp;
	                }
		
	    System.out.println(Arrays.toString(arr)); 
		for (int i = 0; i < arr.length - 1; i++) {
			if (Math.abs(arr[i] - arr[i + 1]) == 1) {
				min++; 
			}
		}
		
		System.out.println(min);
	}
	
}
