package June2020;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*; 

public class teleport {
	
	public static void main(String[] args) throws IOException {
		BufferedReader f = new BufferedReader(new FileReader("teleport.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("teleport.out")));
		StringTokenizer st = new StringTokenizer(f.readLine());

		int a = Integer.parseInt(st.nextToken()); 
		int b = Integer.parseInt(st.nextToken()); 
		int x = Integer.parseInt(st.nextToken()); 
		int y = Integer.parseInt(st.nextToken()); 
			
		int aToY = Math.abs(a - y); 
				
		int aToX = Math.abs(a - x);
		
		int yToB = Math.abs(b - y); 
		
		int xToB = Math.abs(b - x); 
		
		int min = Math.abs(a - b); 
		
		if (aToY + xToB < min) {
			min = aToY + xToB; 
		}
		if (aToX + yToB < min) {
			min = aToX + yToB;
		}
		if (xToB + aToY < min) {
			min = xToB + aToY; 
		}
		if (yToB + aToX < min) {
			min = yToB + aToX; 
		}
		out.println(min); 	
		
		out.close(); 
				
		//I got a 100!!!!!!!
		
	}

}
