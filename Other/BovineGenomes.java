package Other;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BovineGenomes {
	
	public static void main(String[] args) throws IOException {
		BufferedReader f = new BufferedReader(new FileReader("cownomics.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("cownomics.out")));
		StringTokenizer st = new StringTokenizer(f.readLine());
		int n, m;
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		String[] spotty = new String[n]; 
		
		for (int i = 0; 
					i < n; i ++) {
			spotty[i] = f.readLine(); 
		}
		
		String[] plain = new String[n]; 
		
		for (int i = 0; i < n; i ++) {
			plain[i] = f.readLine(); 
		}
		
		
		int count = 0; 
		
		for (int i = 0; i <m; i ++) {  //m is total number of genes that are given
			boolean[] present = new boolean[4]; //A C T G
			Arrays.fill(present, false); //learn this
			for (int j = 0; j<n; j++) {
				char temp = spotty[j].charAt(i); 
				
				if (temp == 'A') {
					present[0] = true; 
				}
				if (temp == 'C') {
					present[1] = true; 
				}
				if (temp == 'T') {
					present[2] = true; 
				}
				if (temp == 'G') {
					present[3] = true; 
				}
			}
			
			boolean overlap = false; 
			for (int j = 0; j < n; j++) {
				char temp = plain[j].charAt(i); 
				
				if (temp == 'A' && present[0]) {
					overlap = true; 
				}
				if (temp == 'C' && present[0]) {
					overlap = true; 
				}
				if (temp == 'T' && present[0]) {
					overlap = true; 
				}
				if (temp == 'G' && present[0]) {
					overlap = true; 
				}
			}
			if (!overlap) {
				count++;
			}
		}

		out.println(count); 
		out.close(); 
	}

}
