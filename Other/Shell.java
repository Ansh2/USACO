package Other;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.util.*; 

public class Shell {
	
	public static void main(String[] args) throws IOException {
//		BufferedReader f = new BufferedReader(new FileReader("shell.in"));
		Scanner st = new Scanner(new File("shell.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("shell.out")));
//		StringTokenizer st = new StringTokenizer(f.readLine());
	
		
		
		
		int n;
		n = st.nextInt();
		
		int[][] x = new int[n][n];
		
		for (int rows = 0; rows < x.length; rows++) {
			for (int columns = 0; columns < x[rows].length; columns++) {
				x[rows][columns] =  st.nextInt();
			}
		}
		
		
	
		
		
		int[] columnsx = new int[n]; 
		int[] count = new int[n];
		
		for (int i = 0; i < columnsx.length; i ++) {
			columnsx[i] = (i + 1); 
		}
		
		int j = 0; 
		for (int rows = 0; rows < x.length; rows++) {
			for (int columns = 0; columns < x[rows].length; columns++) {
				
				if (columnsx[j] == x[rows][columns]) {
					count[j]++;
				}				
			}
			j++; 
		
		}
		int max = count[0]; 
		for (int i = 1; i < count.length; i ++) {
			if (max < count[i]) {
				max = count[i]; 
			}
		}
		
		
		out.println(max);
		st.close();
		out.close(); 
	
	}
	
	
}
