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

public class lifeguards {

	
	public static void main(String[] args) throws IOException{
		
		BufferedReader f = new BufferedReader(new FileReader("cownomics.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("cownomics.out")));
		StringTokenizer st = new StringTokenizer(f.readLine());
		
	
		
		int n; 
		n = Integer.parseInt(st.nextToken());
		
		String[] x = new String[n]; 
		
		int[] start = new int[n]; 
		
		int[] end = new int[n];
		
		for (int i = 0; i <n; i ++) {
			x[i] = f.readLine(); 
		}
		
//		int[] distance = x.split(" ");  
		

		
		for (int i = 0; i < n; i ++) {
			distance[i] = x[i].split(" "); 
		}
		
		for (int i = 0; i < n; i ++) {
			for (int j = start[i]; j < end[i]; j++) {
				
			}
		}
		int cover[n]; 
		for (int i = 0; i < n; i ++) {
			if (times[])
		}
		
		
//		out.println(count); 
		out.close(); 
		
	}
	
	
	
}
