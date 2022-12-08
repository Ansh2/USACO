package Other;
import java.util.Scanner;

import java.util.*;

public class DaisyChains {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();

		int[] petals = new int[n];

		for (int i = 0; i < petals.length; i++) {
			petals[i] = scan.nextInt();
		}

		int photos = 0;
		for (int i = 0; i < n; i++) {
			for (int j = i; j < n; j++) {
				
				int totalPetals = 0; 
				for (int k = i; k <= j; k++) {
					totalPetals += petals[k];
				}		
				
				for (int m = i; m <= j; m++) {
					if (totalPetals == petals[m] * (j - i + 1)) {
						photos++; 
						break;
					}
				}
				
				
			}
		}

		
		//1 picture per pair
		
		
		System.out.println(photos);
		
	}
	



}
