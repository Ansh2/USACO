package Dec2020;
import java.util.Random;
import java.util.Scanner;

public class DaisyChains {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random rand = new Random(); 
		
		int n = scan.nextInt(); 
			
		int[] a = new int[n]; 
	
		
		//N number of flowers in the farm 
		//One specific flower is called flower i 
		//P represents the number of petals 
		
	
		for (int i = 0; i < a.length; i++) {
			a[i] = scan.nextInt(); 
		}
		
		int sum = 0; 
		for (int i = 0; i < a.length; i++) {
			sum += a[i]; 
		}
		int average = sum / n; 
		
		
		int count = 0; 
		for (int i = 0; i < a.length; i++) {
			if (average == a[i]) {
				count++; 
			}
		}
		
		int pictures = 0; 
		for (int i = n; i>0; i--) {
			pictures = pictures + i; 
		}
		
		for (int i = 0; i<a.length; i++) {
			
		}
		
		int[] pic = new int[pictures]; 
		

				
		
		
		System.out.println(pictures - n); 
		
		
		
		
		

	}

}
