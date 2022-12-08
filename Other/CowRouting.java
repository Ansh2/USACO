package Other;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*; 

public class CowRouting {
	
	public static void main(String[] args) throws IOException {
		BufferedReader f = new BufferedReader(new FileReader("cowrouting.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("cowrouting.out")));
		StringTokenizer st = new StringTokenizer(f.readLine());
		
		int cityA = Integer.parseInt(st.nextToken());
		int cityB =  Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken()); 
		int[] cost = new int[N]; 
		int[] cities = new int[N]; 
		int[] finalcost = new int[N]; 
		int positionoffinalcost = 0; 
		for (int i = 1, j = 1; i<=2 * N; i++) {
			if (i % 2 == 1) {
				cost[j] = Integer.parseInt(st.nextToken()); 
				cities[j] = Integer.parseInt(st.nextToken()); 
				j++; 
			} else {
				int [] repeated = new int[cities[j]]; 
				for (int x = 0; x < repeated.length; x++) {
					repeated[x] = Integer.parseInt(st.nextToken()); 
				
				}
				int A = 0; 
				int B = 0; 
				for (int x = 0; x < repeated.length; x++) {       
					if (repeated[x] == cityA) {
						A = x; 
					} 
					if (repeated[x] == cityB) {
						B = x; 
					}
					
					
				}
				if (A < B) {
					finalcost[positionoffinalcost] = cost[j]; 
					positionoffinalcost ++; 
				}
			}
			
		}
		
		int finale = 0; 
		
		for (int i = 0; i < finalcost.length / 2; i++) { //RUNTIMe ERROR
			if (finalcost[i] < finalcost[i+1]) {
				finale = finalcost[i]; 
				
			}
 		}
		out.println(finale); 
		out.close(); 
				
		
		
	}

}
