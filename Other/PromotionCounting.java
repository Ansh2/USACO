package Other;
import java.io.*;
import java.util.*;
//these are all the import statments that we will need for USACO input/output for pre 2021 problems. For not pre 2021 

public class PromotionCounting {
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new FileReader("promote.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("promote.out")));
		StringTokenizer st = new StringTokenizer(br.readLine()); 
		int a = Integer.parseInt(st.nextToken()); 
		int b = Integer.parseInt(st.nextToken()); 
		st = new StringTokenizer(br.readLine()); 
		int c = Integer.parseInt(st.nextToken()); 
		int d = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine()); 
		int e = Integer.parseInt(st.nextToken()); 
		int f = Integer.parseInt(st.nextToken()); 
		st = new StringTokenizer(br.readLine()); 
		int g = Integer.parseInt(st.nextToken()); 
		int h = Integer.parseInt(st.nextToken()); 
		
		//computation 
//		int newPart = (h + f + d + b) - (g + e + c + a );
		int goldToPlat = (h - g); 
		int silToGold = (h - g) + (f - e); 
		int broToSil = (h - g) + (f - e) + (d - c); 
		
		out.println(broToSil); 
		out.println(silToGold); 
		out.println(goldToPlat); 
		
		out.close();
		
	}
}
