package UsacoGuideBronze;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class fencepainting {
	public static void main(String[] args) throws IOException {
		BufferedReader f = new BufferedReader(new FileReader("paint.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("paint.out")));
		StringTokenizer st = new StringTokenizer(f.readLine());
		int a, b, c, d; 
		a = Integer.parseInt(st.nextToken());
		b = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(f.readLine());
		c = Integer.parseInt(st.nextToken());
		d = Integer.parseInt(st.nextToken());
		
		int [] arr = new int [101]; 
		for (int i = a; i < b; i++) {
			arr[i] = 1; 
		}
		for (int i = c; i < d; i++) {
			arr[i] = 1; 
		
		}
		int answer = 0; 
		for (int i = 0; i < arr.length; i ++) {
			answer += arr[i]; 
		}
		out.print(answer);
		out.close(); 
	}


}
