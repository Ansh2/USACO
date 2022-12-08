package Other;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class main {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader f = new BufferedReader(new FileReader("paint2.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("paint.out")));
		StringTokenizer st = new StringTokenizer(f.readLine());
		
		int n = Integer.parseInt(f.readLine());
		String input = f.readLine(); 
		
		int[] petals = new int[n]; 
		int sum = 0; 
		int count = 0; 
		
		for (int i = 0; i <n; i++) {
			petals[i] = Integer.parseInt(st.nextToken()); 
			sum+=petals[i]; 
						
		}
		int avg = sum/n; 
		
		for (int i = 0; i <n; i++) {
			for (int j = 1; j <n ; j++) {
				int sum1 = 0; 
				for (int k = 0; k<=j; k++) {
					sum += petals[k];
					
				}
				boolean found = false; 
				for (int k = i; k<=j; k++) { //one off error 
					if (petals[k] * (j - i + 1) == sum) 
						found = true; 
				}
				if (found) 
					count++; 
			}
		}
		
		out.println(count); 
		out.close(); 
		

		
		
		
	}

}
