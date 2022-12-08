package Other;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.StringTokenizer;

public class CowHerd {

	public static void main(String[] args) throws IOException {
		BufferedReader f = new BufferedReader(new FileReader("herding.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("herding.out")));
		StringTokenizer st = new StringTokenizer(f.readLine());
		
//		Random rand = new Random(); 
		
//		int[] array = new int[(int)(Math.pow(10, 9)) + 1];
		
		int mincount = 0; 
		int maxcount = 0; 
		int count = 0; 

		int a, b, c;
		a = Integer.parseInt(st.nextToken());
		b = Integer.parseInt(st.nextToken());
		c = Integer.parseInt(st.nextToken());
		int minpos = Math.min(a, Math.min(b, c)); 
		int maxpos = Math.max(a, Math.max(b, c)); 
	
		int midpos = 0; 
		
		if (b > a && b < c) {
			midpos = b; 
		} else if (c > b && c < a) {
			midpos = c; 
		} else {
			midpos = a; 
		}
		
//		
//		array[minpos] = minpos; 
//		array[maxpos] = maxpos; 
//		array[midpos] = midpos;
//		
//
//		while (!((midpos - minpos) == 1) && ((maxpos - midpos) == 1)) {
//			
//		}
//		
		
//		if ((midpos - minpos) == 1) {
////			maxpos = minpos - 1; 
//			mincount+=2; 
//		} else if ((maxpos - midpos) == 1) {
//			minpos = maxpos + 1; 
//			mincount+=2; 
		if ((maxpos - midpos) == 2) {
			mincount++; 
		} else if ((midpos - minpos) == 2) {
			mincount++; 
		} else if (!((midpos - minpos) == 1) && ((maxpos - midpos) == 1)) {
			mincount++; 
			mincount--; 
		} else {
			mincount+=2; 
		}
		 
		maxcount = Math.max(b-a, c - b) - 1; 

		
		
		
		
		out.println(mincount);
		out.println(maxcount);
		out.close();
	}
}
