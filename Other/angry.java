package Other;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class angry {
	
	
	public static void main(String[] args) throws IOException{
		BufferedReader f = new BufferedReader(new FileReader("angry.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("angry.out")));
		StringTokenizer st = new StringTokenizer(f.readLine());
		
		int n = Integer.parseInt(f.readLine()); 
		int[] bales = new int[n]; 
		for (int i = 0; i < n; i ++) {
			bales[i] = Integer.parseInt(f.readLine()); 
		}
		
		Arrays.sort(bales);
		
		for (int i = 1; i < )
		
		
		out.close(); 
	}

}
