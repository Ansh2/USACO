package Other;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

public class FencePainting {
	
	public static void main(String[] args) throws IOException {
//		BufferedReader f = new BufferedReader(new FileReader("paint.in"));
//		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("paint.out")));
//		StringTokenizer st = new StringTokenizer(f.readLine());
		
		Scanner st = new Scanner(new File("paint.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("paint.out")));
	
		int[] arr = new int[4]; 
		for (int i = 0; i < arr.length; i++) {
			arr[i] = st.nextInt(); 
		}
		int finale = 0; 
		
		if (arr[3] > arr[0]) {
		int max = arr[1]; 
		int min = arr[1]; 
		for (int i = 1; i <arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i]; 
			}
			
		}
	
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i]; 
			}
		}
	
		 finale = max - min; 
		} 
		
		else if (arr[3] < arr[0]) {
			int first = arr[1] - arr[0]; 
			int second = arr[3] - arr[2]; 
			 finale = second + first; 
		}
	
	
	
		out.println(finale); 
		out.close(); 
	
	}
	

}
