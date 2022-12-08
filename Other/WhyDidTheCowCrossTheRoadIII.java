package Other;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class WhyDidTheCowCrossTheRoadIII {
	
	public static void main(String[] args) throws IOException{
		BufferedReader f = new BufferedReader(new FileReader("cowqueue.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("cowqueue.out")));
		StringTokenizer st = new StringTokenizer(f.readLine());
	
		int n = Integer.parseInt(f.readLine());
//		int[][]	 times = new int[n][2];
		Pair[] times = new Pair[n]; 
		int time = 0;  
		for (int i = 0; i < n; i ++) {
			int time1= Integer.parseInt(st.nextToken()); 
			int val = Integer.parseInt(st.nextToken()); 
			times[i] = new Pair(time1, val); 
		}
		
		//need to sort the elements
		
		Arrays.sort(times);
		
		for (int i = 0; i < n; i++) {
			int start = times[i].x; 
			int length = times[i].y; 
			if (start >= time) {
				time = start + length; 
			} else {
				time += length; 
			}
		}
		System.out.println(time);
		out.println(time); 
		out.close(); 
		
	}
	
	static class Pair implements Comparable<Pair> {
		public int x; 
		public  int y; 
		public Pair(int x, int y) {
			this.x = x; 
			this.y = y; 
		} 
		public int compareTo(Pair other) {
			return this.x - other.x;
		}
	}

}
