package June2020;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*; 

public class hoofball {
	
	public static void main(String[] args) throws IOException {
		BufferedReader f = new BufferedReader(new FileReader("hoofball.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("hoofball.out")));
		StringTokenizer st = new StringTokenizer(f.readLine());
		
		int cows = Integer.parseInt(st.nextToken());
		
		int min = 1; 
		
		int[] arr = new int[cows]; 
		for (int i = 0; i < cows; i++) {
			arr[i] = Integer.parseInt(st.nextToken()); 
			
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
		
		for (int i = 0; i < arr.length - 1; i++) {
			if (Math.abs(arr[i] - arr[i + 1]) == 1) {
				min++; 
			}
		}
	
		out.println(min); 
		out.close(); 
				
		
		
	}

}
